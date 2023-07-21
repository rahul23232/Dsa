/**
 * @param {number} n
 * @return {boolean}
 */
var isArmstrong = function(n) {
    let count = 0;
    let temp = n;
    while(temp>0){
        count++;
        temp = parseInt(temp/10);
    }
    let temp2 = n;
    let sum = 0;
    while(temp2>0){
        let val = temp2%10;
        sum += Math.pow(temp2%10,count);
        
        temp2 = parseInt(temp2/10);
    }
    
    return sum == n;

};