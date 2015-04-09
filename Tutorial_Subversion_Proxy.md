# Subversion avec le proxy de la fac #

_Remarque : Comme miguel l'a dit, plus tard il faudra un environnement de développement commun à tout le monde (Eclipse) d'autant plus qu'on bosse sous des systèmes d'exploitation différents. Donc le tutorial devra être mis  à jour pour configurer eclipse avec le proxy pour subversion_

  1. éditer le fichier ~/.subversion/servers
  1. tout à la fin, dans la section global ajouter :
```
        http-proxy-host = www-cache
	http-proxy-port = 3128
```
  1. Il doit y avoir des moyens plus propre, mais je n'ai testé !
  1. n'oublier pas de l'enlever quand vous êtes ailleurs !