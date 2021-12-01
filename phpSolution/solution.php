<?php

// Time and space complexity = O(n)
// Solution tracks visisted items in the array and record thier complement
// i.e (target - arrayItem). 
// It later check if the next visisted item has been recorded as a
// compliment. If it has, then the
// Correct pair that sums up to the target is the currentItem and the diff

function findPair(array $arr,  int $target): array
{
    $seen = [];
    for ($x = 0; $x < sizeof($arr); $x++) {
        if (array_key_exists(strval($arr[$x]), $seen)) {
            return [$seen[$arr[$x]], $x];
        } else {
            $seen[$target - $arr[$x]] = $x;
        }
    }
    return [0, 0];
}

$arr = [2, 5, 3, 13, 19, 9, 10];
$target = 14;

print_r(json_encode(findPair($arr, $target)));
