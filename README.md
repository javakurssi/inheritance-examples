# Perintä ja rajapinnat -esimerkkejä

Tässä repositoriossa on esimerkkejä perinnän ja rajapintojen soveltamisesta Java-ohjelmoinnissa.

Repositorio sisältää eri kehityshaaroja, joissa saman esimerkin toteutusta on jatkettu eri tavoin:

* **master** / **god-class**

   Tässä kehityshaarassa on esimerkin lähtötilanne, jossa kaikki toiminnallisuus on toteutettu yhdessä [Product-luokassa](./src/main/java/inheritance/Product.java) ([God Class -anti-pattern](https://hackernoon.com/avoiding-software-bottlenecks-understanding-the-god-object-anti-pattern)).

* **separate-classes**

   Tässä kehityshaarassa on esimerkin ensimmäinen paranneltu versio, jossa toiminnallisuus on jaettu useampaan luokkaan avulla. Esimerkissä luokan rakenne on yksinkertaistunut, mutta samalla on syntynyt kaksi uutta ongelmaa: koodissa on ylimääräistä toistoa ja Product-, Vehicle- ja Apartment-luokat eivät ole yhteensopivia keskenään.

* **inheritance**

   Tässä kehityshaarassa on esimerkin toinen paranneltu versio, jossa on hyödynnetty perintää. Koodin toisto on vähentynyt ja luokat ovat nyt yhteensopivia keskenään. Niitä voidaan esimerkiksi käsitellä samaan kokoelmaan tallennettuina Product-tyyppisinä olioina.

* **polymorphism**

   Viimeisessä esimerkkihaarassa on uusia luokkia, jotka havainnollistavat eri tyyppisten tuotteiden esittämistä HTML-muodossa. Java huolehtii automaattisesti siitä, että oikeat metodit kutsutaan oikeista luokista, mutta toisinaan tarvitsemme myös itse tietoa olion tyypistä, jotta osaamme käsitellä dataa oikein. Tässä esimerkissä käytetään lopulta `instanceof`-operaattoria olioiden tyypin tarkastamiseen.
