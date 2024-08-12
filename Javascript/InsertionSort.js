const prompt=require("prompt-sync")({sigint:true});
function Insertionsort(arr,size){
    for(let i=1;i<size;i++){
        let min=arr[i];
        let j=i-1;
        while(j>=0 && arr[j]>min){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=min;
    }
    console.log(arr);
}
var size=prompt("Enter Array of Size => ");
var arr=[];
for(let i=0;i<size;i++){
arr[i]=parseInt(prompt());
}
Insertionsort(arr,size);