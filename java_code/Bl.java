/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$ListAdapter$Converter
 */
import com.google.protobuf.Internal;

class Bl
implements Internal.ListAdapter.Converter<Integer, bj_0> {
    Bl() {
    }

    public bj_0 a(Integer n) {
        bj_0 bj_02 = bj_0.a(n);
        return bj_02 == null ? bj_0.a : bj_02;
    }

    public /* synthetic */ Object convert(Object object) {
        return this.a((Integer)object);
    }
}

