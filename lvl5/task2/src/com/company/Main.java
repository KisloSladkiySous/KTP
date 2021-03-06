package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Введите фигуру, позицию и цель");
        Scanner read=new Scanner(System.in);
        String name=read.nextLine();
        String current=read.nextLine();
        String target=read.nextLine();;
        System.out.println(chess(name,current,target));
    }
    public static boolean chess(String name, String position, String target){
        char pLet = position.charAt(0);
        int pNum = Integer.parseInt(String.valueOf(position.charAt(1)));
        char tLet = target.charAt(0);
        int tNum = Integer.parseInt(String.valueOf(target.charAt(1)));

        if (pLet == tLet && pNum == tNum) return false;
        switch (name){
            case "Pawn":
            {
                if (pLet==tLet && pNum==2 && tNum==4) return true;
                if (pLet==tLet && pNum==(tNum-1)) return true;
                return false;
            }
            case "Knight":
            {
                if ((Math.abs(pLet-tLet)==2 && Math.abs(pNum-tNum)==1)||(Math.abs(pLet-tLet)==1 && Math.abs(pNum-tNum)==2)) return true;
                return false;
            }
            case "Bishop":
            {
                if (Math.abs(pLet-tLet)==Math.abs(pNum-tNum))return true;
                return false;
            }
            case "Rook":
            {
                if ((pLet==tLet && pNum!=tNum) || (pLet!=tLet && pNum==tNum)) return true;
                return false;
            }
            case "Queen":
            {
                if ((pLet==tLet && pNum!=tNum) || (pLet!=tLet && pNum==tNum)) return true;
                if (Math.abs(pLet-tLet)==Math.abs(pNum-tNum))return true;
                break;
            }
            case "King":
            {
                if (Math.abs(pLet-tLet)<2 && Math.abs(pNum-tNum)<2) return true;
                return false;
            }
            default: return false;
        }
        return false;
    }
}