# DIP
## Dependency Inversion Principle (DIP)
Le principe d’inversion de dépendance (DIP) stipule que nous devrions dépendre d’abstractions (interfaces et classes abstraites) au lieu d’implémentations concrètes (classes). Les abstractions ne doivent pas dépendre de détails; au lieu de cela, les détails devraient dépendre d’abstractions.
### Exemple
Supposons que vous avez une classe responsable de la journalisation. Cette classe est utilisée dans un service afin de journaliser les entrées et sorties
#### Probleme
Ici, Logger et SomeService sont fortement couplées. Le problème surgira lorsqu’il faudra journaliser dans un fichier au lieu de la console, surtout si Logger est utilisée comme telle partout dans l’application.
#### Solution
Notre solution est d'utiliser une interface au lieu d'une classe concrète pour notre service qui dépend juste de l'interface et de cette façon
nous pourrons éviter le couplage fort entre notre logger et nos services et pour lier les deux nous nous appuierons sur le principe de l'injection de dépendance à travers le constructeur