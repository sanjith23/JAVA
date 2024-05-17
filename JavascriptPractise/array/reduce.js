//reduce method in JS

marks = [10,20,30,40]
var sum = 0
for(let i=0; i<marks.length; i++)
    {
        sum = sum + marks[i];
    }

    console.log(sum)

    //reduce
    console.log(marks.reduce((sum,mark) => sum + mark,0))

    var score = [17,28,39,20]

    console.log(score)
    console.log(score.filter(score=>score%2==0))

