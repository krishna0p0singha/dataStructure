<?php
function SelectionSort($arr,$size){
for($i=0;$i<$size-1;$i++){
    $min=$i;
    for($j=$i+1;$j<$size;$j++){
        if($arr[$j]<$arr[$min]){
            $min=$j;
        }
    }
    $temp=$arr[$i];
    $arr[$i]=$arr[$min];
    $arr[$min]=$temp;
}
print_r($arr);
}
$size=(int)readline("Enter size of Array => ");
$arr=[];
for($i =0;$i<$size;$i++){
    $arr[$i]=readline();
}
SelectionSort($arr,$size);
?>