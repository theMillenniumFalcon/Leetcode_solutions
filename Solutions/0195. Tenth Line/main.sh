#! /bin/bash
i=0

cat file.txt | while read line; do
    ((i++))

    if [[ $i -eq 10 ]]; then
        echo $line
    fi
done