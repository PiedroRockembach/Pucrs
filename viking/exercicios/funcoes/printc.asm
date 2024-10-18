main
fraseum
	ldi r1,primfrase
	ldi lr,frasedois
	bnz r7,printc
frasedois
	ldi r1,segfrase
	ldi lr,fim
	bnz r7,printc
	
printc	
	bez r1,lr
	ldb r3,r1
	stw r3,0xf000
	add r1,1
	bnz r7,printc

fim
	hcf

primfrase	"Esta é a primeira soma"
segfrase	"Esta é a segunda soma"
tercfrase	"Finalizando o programa"