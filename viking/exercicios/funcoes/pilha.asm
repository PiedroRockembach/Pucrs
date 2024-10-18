; exercicio somasr 23 e 32 depois
main
    ldw r3,a
    ldw r4,b
    ldi r6,ret1
    bnz r7,soma
    
ret1
    stw r5,0xf002
    hcf
soma
    add r5,r3,r4
    bnz r7,ret1