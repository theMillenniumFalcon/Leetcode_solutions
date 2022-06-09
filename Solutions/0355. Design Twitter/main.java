import java.util.*;

class Twitter {

    Map<Integer, Set<Integer>> followMap;

    // key: useId | value: tweet id and timestamp
    Map<Integer, Queue<int[]>> tweetMap;

    int size;

    int timestamp;

    public Twitter() {
        this.followMap = new HashMap<Integer, Set<Integer>>();
        this.tweetMap = new HashMap<Integer, Queue<int[]>>();
        this.size = 10;
        this.timestamp = 0;
    }

    public void postTweet(int userId, int tweetId) {
        Queue<int[]> queue = tweetMap.getOrDefault(userId, new LinkedList<int[]>());
        queue.offer(new int[] {
                tweetId,
                timestamp++
        });
        // only recent 10 tweets are needed
        if (queue.size() > size) {
            queue.poll();
        }
        tweetMap.put(userId, queue);
    }

    public List<Integer> getNewsFeed(int userId) {
        // retrive users that we are following
        Set<Integer> following = followMap.getOrDefault(userId, new HashSet<Integer>());
        following.add(userId);

        // create a min heap. Top 10 tweets with larger timestamp will be in the heap
        Queue<int[]> minHeap = new PriorityQueue<int[]>(size, (a, b) -> a[1] - b[1]);
        for (Integer followingUserId : following) {
            Queue<int[]> tweets = tweetMap.getOrDefault(followingUserId, new LinkedList<int[]>());
            minHeap.addAll(tweets);
            while (minHeap.size() > size) {
                minHeap.poll();
            }
        }

        // let most recent tweet show first
        List<Integer> res = new ArrayList<>();
        while (minHeap.size() > 0)
            res.add(minHeap.poll()[0]);
        Collections.reverse(res);
        return res;

    }

    public void follow(int followerId, int followeeId) {
        Set<Integer> following = followMap.getOrDefault(followerId, new HashSet<Integer>());
        following.add(followeeId);
        followMap.put(followerId, following);
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> following = followMap.getOrDefault(followerId, new HashSet<Integer>());
        following.remove(followeeId);
        followMap.put(followerId, following);
    }
}