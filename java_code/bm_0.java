/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$ListAdapter$Converter
 */
import com.google.protobuf.Internal;

/*
 * Renamed from Bm
 */
class bm_0
implements Internal.ListAdapter.Converter<Integer, bq_0> {
    bm_0() {
    }

    public bq_0 a(Integer n) {
        bq_0 bq_02 = bq_0.a(n);
        return bq_02 == null ? bq_0.a : bq_02;
    }

    public /* synthetic */ Object convert(Object object) {
        return this.a((Integer)object);
    }
}

