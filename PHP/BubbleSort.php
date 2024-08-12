<?php
function bubbleSort($arr){
for($i=0;$i<count($arr)-1;$i++){
    for($j=0;$j<count($arr)-$i-1;$j++){
        if($arr[$j]>$arr[$j+1]){
            $temp=$arr[$j];
            $arr[$j]=$arr[$j+1];
            $arr[$j+1]=$temp;
        }
     }
    }
print_r($arr);
}
$a=(int)readline("Enter Array suze => ");
$arr=[];
for($i=0;$i<$a;$i++){
    $arr[$i]=(int)readline();
}
bubbleSort($arr);
?>