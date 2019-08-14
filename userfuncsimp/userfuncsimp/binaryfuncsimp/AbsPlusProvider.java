package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinFuncProvider;
import userfuncs.binaryfuncs.BinaryFunc;

public class AbsPlusProvider implements BinFuncProvider {
    public BinaryFunc get(){
        return new AbsPlus();
    }
}
