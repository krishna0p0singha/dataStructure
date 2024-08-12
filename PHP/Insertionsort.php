<?php
function Insertionsort($arr,$size){
    for($i=1;$i<$size;$i++){
        $min=$arr[$i];
        $j=$i-1;
        while ($j>=0 && $arr[$j]>$min) {
            $arr[$j+1]=$arr[$j];
            $j--;
        }
        $arr[$j+1]=$min;
    }
    print_r($arr);
}

$size=(int)readline('Enter Size of an array= > ');
$arr=[];
for($i=0;$i<$size;$i++){
    $arr[$i]=(int)readline();
}
Insertionsort($arr,$size);
?>