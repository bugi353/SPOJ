#include <iostream>
#include <sstream>
#include <string>

using namespace std;

string funkcja(int m)
{
    stringstream ss;
    ss << m;
    return ss.str();
}




string napis, napis1;
int test;
int l=1;
int x=0;
int n;
int h;
int z;

int main()

{
    cin>>test;
    string slowa[test];

    for (int i = 0; i<test; i++)

    {

      cin>>slowa[i];
      napis = slowa[i];


    for (int i=1; i<napis.length(); i++)
    {
        h = i;
        z = napis.length();
        if (napis.at(i)==napis.at(i-1))
        {
            l++;
        }
        else if(h=z-1)
        {
            if (l<=2)
            {
                l=1;
            }
            else if (10>l>2)
            {
                napis.erase(i-l+1,i-1);
                n = l;
                napis1 = funkcja(n);
                napis.insert(i-l+1, napis1);

                i = i-l+3;
                l = 1;

            }
            else if (100>l>9)
            {
                napis.erase(i-l+1,i-1);
                n = l;
                napis1 = funkcja(n);
                napis.insert(i-l+1, napis1);

                i = i-l+4;
                l = 1;
            }
            else
            {
                napis.erase(i-l+1,i-1);
                n = l;
                napis1 = funkcja(n);
                napis.insert(i-l+1, napis1);

                i = i-l+5;
                l = 1;
            }
        }
            else
        {
            if (l<=2)
            {
                l=1;
            }
            else if (10>l>2)
            {
                napis.erase(i-l+1,i-1);
                n = l;
                napis1 = funkcja(n);
                napis.insert(i-l+1, napis1);

                i = i-l+3;
                l = 1;

            }
            else if (100>l>9)
            {
                napis.erase(i-l+1,i-1);
                n = l;
                napis1 = funkcja(n);
                napis.insert(i-l+1, napis1);

                i = i-l+4;
                l = 1;
            }
            else
            {
                napis.erase(i-l+1,i-1);
                n = l;
                napis1 = funkcja(n);
                napis.insert(i-l+1, napis1);

                i = i-l+5;
                l = 1;
            }
    }

    }
        slowa[i] = napis;
        cout<<slowa[i]<<endl;
    }



    return 0;
}
