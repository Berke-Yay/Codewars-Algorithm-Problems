sayac=0
toplam=0
sayi=int(input("Bir sayı giriniz(Çıkış için -1): "))

enB=sayi
enK=sayi
while True:
    toplam=toplam+sayi
    sayi=int(input("Bir sayı giriniz(Çıkış için -1): "))
    sayac=sayac+1

         
    if sayi==-1:

        break
    else:
        if sayi>enB:
            enB=sayi
        if sayi<enK:
            enK=sayi
ort=int(toplam/(sayac))
print("Ortalama: ",ort)
print("En büyük sayı: ",enB)
print("En küçük sayı: ",enK)