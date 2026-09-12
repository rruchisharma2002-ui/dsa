// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

console.log("========Method 1=========");

let array=[2,3,4,5,8,9,13,14];
let target=6;
let found='no';
for(let i=0;i<array.length;i++){
    
    for (let j=i;j<array.length;j++){
       
        if(i==j){
            continue;
        }
         let cal=array[i]+array[j];
         if(cal==target){
            found="yes";
            console.log(i+" "+ j+"===>"+cal);
         }
    }
}

console.log("========Method 2=========");

let left=0;  let right= array.length-1;
let sum;

while(left<right){
    sum=array[left]+array[right];
    
    if(sum==target){
        console.log("found"+sum);
        break;
    }else if(sum<target){
   
        left++;
    }else if (sum>target){
        right--;
    }
    
    
}

console.log("========Method 3=========");
let newarray=[]
for(i=0;i<array.length;i++){
    
    differ=target-array[i]
    if (newarray.hasOwnProperty(differ)) {
        console.log(`Found: ${array[i]} + ${differ} = ${target}`);
        console.log(`Indices: ${newarray[differ]}, ${i}`);
        break; // Exit loop once found
    }
    
    newarray[array[i]]=i;
        console.log(`${array[i]} +++ ${differ}`);
    
}
