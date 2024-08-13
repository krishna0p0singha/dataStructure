const prompt=require("prompt-sync")({sigint:true});
function SelectionSort(arr,size){
for(let i=0;i<size-1;i++){
    var min=i;
    for(let j=i+1;j<size;j++){
        if(arr[j]<arr[min]){
            min=j;
        }
    }
    var temp =arr[i];
    arr[i]=arr[min];
    arr[min]=temp;
}
console.log(arr);
}
var size=prompt("Enter Array of Size => ");
var arr=[];
for(let i=0;i<size;i++){
arr[i]=parseInt(prompt());
}
SelectionSort(arr,size);