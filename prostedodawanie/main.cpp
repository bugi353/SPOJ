#include <iostream>

using namespace std;
int testy, ilosc;
int suma;


int main()
{
    cin>>testy;

    for (int i =0; i<testy; i++)

    {

    cin>>ilosc;
    int liczba[ilosc];
    suma = 0;

    for (int i=0; i<ilosc; i++)
    {
        cin>>liczba[i];
        suma += liczba[i];
    }

    cout<<suma<<endl;

    }
    return 0;
}
