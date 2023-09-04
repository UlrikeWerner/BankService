# BankService
- Erstellt eine Record 'Client' mit den Eigenschaften Vorname, Nachname und Kundennummer (wähle geeignete englische Feldnamen).
- Erstellt eine Klasse 'Account' (kein Record, soll vorerst veränderlich sein) mit den Eigenschaften Kontonummer (String), Kontostand (BigDecimal) und dem zugehörigen Kunden.
- Implementiert eine Methode, um Geld auf das Konto einzuzahlen.
- Implementiert eine Methode, um Geld vom Konto abzuheben.
- Erstellt eine Klasse 'BankService', die eine Menge von Konten verwaltet.
- Implementiert eine Methode im BankService, um ein Konto zu eröffnen. Man soll dafür nur einen Kunden als Argument übergeben müssen. Es soll die neue Kontonummer zurückgeben.
- Implementiert eine Methode im BankService, von einer Kontonummer (als String) einen bestimmten Betrag (als BigDecimal) auf eine andere Kontonummer (als String) zu überweisen.
- Baut Eure Records und Klassen so um, dass ein Konto mehreren Kontoinhaberinnen gehören kann (zwei oder mehreren Kontoinhaberinnen).

- Schreibe im Service eine Methode public List<String> split(String accountNumber), die ein Konto zu gleichen Teilen aufteilt. Aus einem Gemeinschaftskonto soll dabei pro Kontoinhaber*in ein Einzelkonto entstehen. Es soll die entstandenen neuen Kontonummern zurückgeben. Jedes Konto soll nach der Aufteilung gleich viel Geld abbekommen (+- 1 Cent). Achte darauf, dass uns als Bank dabei weder Cent-Gewinne noch Cent-Verluste entstehen.

- PS: wie üblich gibt es auch bei unserer Bank keine halben Cent ;)

- Tipp: auch hier eignet sich Test Driven Development sehr gut, um die Aufgabe zu lösen! (gilt auch für die folgenden Aufgaben)
