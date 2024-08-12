/**
 * @param {string[]} strs
 * @return {string}
 */
function longestCommonPrefix(strs) {
    if (strs.length === 0) return "";

    // Sort the array
    strs.sort();
    
    // Take the first and last string in the sorted array
    let first = strs[0];
    let last = strs[strs.length - 1];
    
    // Initialize the index for the common prefix
    let i = 0;
    
    // Compare characters until they match
    while (i < first.length && first[i] === last[i]) {
        i++;
    }
    
    // Return the common prefix
    return first.substring(0, i);
}

// Example usage
let strs = ["flower", "flow", "flight","ight"];
console.log(longestCommonPrefix(strs)); // Output: "fl"
let a=1;
console.log(a);
console.log(a++);
console.log(++a);