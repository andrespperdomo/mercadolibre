# mercadolibre

1. Ejecutar el comando "mvn package" 
2. En la carpeta target ejecutar el comando "java -jar mercadolibre-final.war" para iniciar la aplicación localmente
3. Probar la aplicación con soapui, postman o curl local en
4. http://localhost:8082/mutant
5. request validar mutante
{
	"dna":["ATGCGA","CAGTGC", "TTACGT","AGAAGG", "CCCTTA","TCACTG"]
}
6. consultar dna
7.  http://localhost:8082/stats
8.  Para probar remotamente en google cloud, soapui ,postman o curl
9.  Registar: 
10.  https://daring-chess-326903.uc.r.appspot.com/mutant
11.  {
	"dna":["ATGCGA","CAGTGC", "TTACGT","AGAAGG", "CCCTTA","TCACTG"]

11.  Consultar:
12.   https://daring-chess-326903.uc.r.appspot.com/stats
13. Para verificar la cobertura de codigo y pruebas unitarias target\site\jacoco\index.html, aparece el reporte con jacoco
