let array=[1, 2, 3, 1,2];
for(let i=0;i<array.length;i++){
    
    for(let j=0; j<array.length;j++){
        
        if(i==j){
            continue;
        }
        
        differ=array[j]-array[i];
        if(differ==0){
              console.log(array[i],array[j]);
              console.log(i,j);
        }
        
      
        
    }
   
    
}
 console.log("====METHOD 2===")
 
let dupcheck=[];
let finddduplicate=[];
for(i=0; i<array.length;i++){
    
       if (dupcheck.hasOwnProperty(array[i])) {
           finddduplicate[i]=array[i];
        console.log(`Found: ${array[i]}`);
        console.log(`Indices: ${i}`);
        
    }
    
    dupcheck[array[i]]=i;
}

console.log(dupcheck);
console.log(finddduplicate);

 console.log("====METHOD 3===")
 
let arr=[1,1,2,3,4];
for(i=0; i<array.length;i++){
    if(arr[i]==arr[i+1]){
        console.log("duplicates found "+arr[i], arr[i+1]);
    }
}
