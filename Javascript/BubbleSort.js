 const prompt=require("prompt-sync")({sigint:true});

 function bubbleSort(arr){
for(let i=0;i<arr.length-1;i++){
    for(let j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
            temp=arr[i];
            arr[j]=arr[j+1];
            arr[j+1]=temp
        }
    }
}
console.log(arr);
}
var size=prompt("Enter Array size => ");
var arr=[];
for(let i=0;i<size;i++){
arr[i]=parseInt(prompt())
}
bubbleSort(arr)