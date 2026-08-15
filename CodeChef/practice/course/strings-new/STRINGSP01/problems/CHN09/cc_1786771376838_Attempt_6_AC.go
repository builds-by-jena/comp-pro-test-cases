"os"
)

func main() {
    reader := bufio.NewReader(os.Stdin)
    var t int
    if _, err := fmt.Fscan(reader, &t); err != nil {
        return
    }

    for i := 0; i < t; i++ {
        var s string
        fmt.Fscan(reader, &s)

        countA := 0
        countB := 0
        for _, ch := range s {
            if ch == 'a' {
                countA++
            } else if ch == 'b' {
                countB++
            }
        }

        if countA < countB {
            fmt.Println(countA)
        } else {
            fmt.Println(countB)
        }
    }
}
default keyword
defer keyword