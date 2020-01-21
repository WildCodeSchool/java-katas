# Censure

Vous avez une liste de phrases où vous souhaitez censurer un mot.

Retourner un tableau contenant uniquement les phrases censurées, dont le mot est remplacé par sa première lettre et un nombre d'étoile correspondant au nombre de lettres restantes du mot recherché.

Exemple : 
```
    sentences :
    {
        "J'aime manger des tacos de bon matin",
        "Le skate et le roller c'est un peu pareil",
        "Notre menu propose des tacos au boeuf"
    }
    word : "tacos"
    
    result : 
    [
        "J'aime manger des t**** de bon matin",
        "Notre menu propose des t**** au boeuf"
    ]
```