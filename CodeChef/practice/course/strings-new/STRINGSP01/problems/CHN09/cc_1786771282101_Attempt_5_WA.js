function Paint(tests) {
    let t = parseInt(tests[0]);
    for (let i = 1; i < tests.length; i++) {
        let s = tests[i]; 
        // Write your code here
    }
}

process.stdin.setEncoding('utf8');
let input = '';
process.stdin.on('data', function(chunk) {
    input += chunk;
});

process.stdin.on('end', function() {
    const tests = input.trim().split('\n');
    Paint(tests);
});