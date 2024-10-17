main
	ldi r1,prsoma
	ldi r2,r1
	ldi lr,somaum
	bnz r7,printc
somaum
	ldw r1,a
	ldw r2,b
	add r3,r2,r1
	stw r3,0xf002
	bnz r7,fim
	
printc	
	bez r2,lr
	ldb r3,r2
	stw r3,0xf000
	add r2,1
	bnz r7,printc
sum

fim
	hcf

a	5
b	2
c	10
prsoma	"Esta é a primeira soma"

segsoma	"Esta é a segunda soma"