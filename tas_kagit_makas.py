import random
secenek=("taş","kağıt","makas")
kullanıcı_puan = 0
bilgisayar_puan =0
while True:
    siz=input("taş?,kağıt?,makas?(çıkmak için q)")
    if siz == "q":
        print("Siz: "+str(kullanıcı_puan)+" / Bilgisayar: "+str(bilgisayar_puan))
        break;
    siz=siz.lower()
    bilgisayar=random.choice(secenek)
    print("Sizin seçiminiz: "+siz+" Bilgisayarın seçimi: "+bilgisayar)

    if siz==bilgisayar:
        print("Berabere kaldınız")
    elif siz=="taş":
        if bilgisayar=="kağıt":
            print("kaybettiniz")
            bilgisayar_puan+=1
        else:
            print("kazandınız")
            kullanıcı_puan+=1
    elif siz=="kağıt":
        if bilgisayar=="taş":
            print("kazandınız")
            kullanıcı_puan+=1
        else:
            print("Kaybettiniz")
            bilgisayar_puan+=1
    elif siz=="makas":
        if bilgisayar=="kağıt":
               print("Kazandınız")
               kullanıcı_puan+=1
        else:
            print("Kaybettiniz")
            bilgisayar_puan+=1