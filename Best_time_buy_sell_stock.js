let array=[7,1,5,3,6,4];
let profit=0;
let buy_at=0; 
let sell_at=0;
for(i=0;i<array.length;i++){
   // console.log(`${i}.  ${array[i]}`)
    for(j=i+1;j<array.length;j++){
        console.log(` ${i},  ${j}  ${array[i]},${array[j]} `)
        differ=array[j]-array[i];
        if(differ>profit){
            profit=differ;
            buy_at=array[i];
            sell_at=array[j];
        }
    }
   
}

 
 
  console.log("============="+buy_at)
  console.log("============="+sell_at)
  console.log("============="+profit);
  console.log("========method 2=====");
  let minimum=array[0];
  let profit_new=0
  let B=0;let S=0;
  for(let i =0; i<array.length;i++){
      
      if(array[i]<minimum){
          minimum=array[i];
          B=array[i];
      }
      differ=array[i]-minimum;
      if(differ>profit_new){
          profit_new=differ;
          S=array[i];
      }
      
  }
  
    console.log("buy====>"+B);
      console.log("sell====>"+S);
  console.log("profit====>"+profit_new);