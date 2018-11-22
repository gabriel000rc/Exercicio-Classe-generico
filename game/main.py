import pygame, random
from bloco import Bloco
from time import sleep
import random

jogar = True
while jogar:
    
	jogar = False 
	ALTURA = 500
	LARGURA = 300

	pontos = 0

	FPS = 30
	clock = pygame.time.Clock()

	BRANCO = (255, 255, 255)
	VERMELHO = (255, 0, 0)
	VERDE = (0, 255, 0)
	AZUL = (0, 0, 255)
	PRETO = (0, 0, 0)

	pygame.init()
	tela = pygame.display.set_mode((LARGURA, ALTURA))
	pygame.display.set_caption("CORRE")
	fonte = pygame.font.SysFont("comicsansms", 30)


	listaSprites = pygame.sprite.Group()

	personagem = Bloco(BRANCO, 20, 20, 150, 450)
	x = random.randrange(LARGURA - 40)
	y = random.randrange(0,300)
	inimigos = Bloco(VERMELHO, 40, 20, x, y)

	lista = []
	lista.append(inimigos)

	listaSprites.add(personagem)
	listaSprites.add(inimigos)

	sair = False
	bateu = False
	i = 0
	j = 0
	texto = fonte.render("Pontos: " + str(pontos), True, (BRANCO))


	while not sair:
	    clock.tick(FPS)
	    j = j + 1

	    for inimigo in lista:
	    	inimigo.decer()

	    	bateu = pygame.sprite.collide_rect(personagem, inimigo)
	    	print(inimigo.rect.y)
	    	if inimigo.rect.y > 450:
	    		listaSprites.remove(inimigo)
	    		pontos = pontos + 10
	    		texto = fonte.render("Pontos: " + str(pontos), True, (BRANCO))
	    		
	    	if bateu == True:            
	            texto = fonte.render("Pontos: " + str(pontos), True, (BRANCO))
	            gameOver = fonte.render("GAME OVER", True, (VERMELHO))
	            mensagemFinal = fonte.render("Precione Espaço", True, (VERDE))
	            sair = True
	            


	    if j == 50:
	        j = 0
	        x = random.randrange(LARGURA - 40)
	        y = random.randrange(0,300)
	        inimigos = Bloco(VERMELHO, 40, 20, x, y)
	        lista.append(inimigos)
	        inimigos.numero = i
	        listaSprites.add(inimigos)

	 

	    for event in pygame.event.get():
	        if event.type == pygame.QUIT:
	            sair = True
	        if event.type == pygame.KEYDOWN:
	            tecla = pygame.key.get_pressed()

	            if tecla[pygame.K_F1]:
	               print("F1")

	            if tecla[pygame.K_RIGHT]:
	                personagem.andarDireita()
	                
	            if tecla[pygame.K_LEFT]:
	                personagem.andarEsquerda()
	                



	    tela.fill(PRETO)
	    listaSprites.draw(tela)
	    if bateu == True:
	        tela.blit(texto, (0, 0))
	        tela.blit(gameOver, (50, 250))
	        tela.blit(mensagemFinal, (30, 400))

	    else:
	    	tela.blit(texto, (0, 0))
	    pygame.display.update()



	sair = False

	while not sair:
		
	    for event in pygame.event.get():
	        if event.type == pygame.QUIT:
	            sair = True
	        if event.type == pygame.KEYDOWN:
	            tecla = pygame.key.get_pressed()

	            if tecla[pygame.K_F1]:
	               print("F1")
	            if tecla[pygame.K_SPACE]:
	            	jogar = True
	            	sair = True
pygame.quit()