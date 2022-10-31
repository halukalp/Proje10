package com.migros.ucg.exceptions.program;

import com.migros.ucg.utility.Util;

import javax.swing.*;

public class Main
{
    private static final int LIM_MIN = 0;
    private static final int LIM_MAX = 100;

    public static void main(String[] args)
    {
        // showInputDialog() exception handling'e dahil edilmedi; çünkü tasarlana bir görsel komponent ortamı mevcut değil.
        String strInput = JOptionPane.showInputDialog(LIM_MIN + " ve " + LIM_MAX + " arasında bir sayı(int) giriniz:");

        inputKontrolEt(strInput);
    }

    private static void inputKontrolEt(String inputStr)
    {
        if(inputStr == null)
        {
            Util.showInfoMessage("Çıkış yapıldı.");
        }
        else
        {
            try
            {
                int input = Integer.parseInt(inputStr);

                if(input < LIM_MIN || input > LIM_MAX)
                {
                    throw new IllegalArgumentException(LIM_MIN + " ve " + LIM_MAX + " aralığı dışı değerler geçersiz.");
                }
            }
            catch (NumberFormatException e)
            {
                Util.showErrorMessage("Tamsayı(int) hariç bir değer girildi.");
            }
            catch (IllegalArgumentException e)
            {
                Util.showGeneralExceptionInfo(e);
            }
            catch (Exception e)
            {
                Util.showGeneralExceptionInfo(e);
            }
        }
    }
}
