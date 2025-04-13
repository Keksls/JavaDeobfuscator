/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from eSu
 */
public final class esu_1 {
    private esu_1() {
    }

    public static byte[] a(List<esl_1> list) {
        kj_0 kj_02 = esu_1.b(list);
        return kj_02.g().toByteArray();
    }

    public static kh_0 a(ByteBuffer byteBuffer) {
        kh_0 kh_02;
        try {
            kh_02 = kh_0.a(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize haven world list from protobuf.", invalidProtocolBufferException);
        }
        return kh_02;
    }

    private static kj_0 b(List<esl_1> list) {
        kj_0 kj_02 = kh_0.f();
        for (esl_1 esl_12 : list) {
            kj_02.a(esu_1.a(esl_12));
        }
        return kj_02;
    }

    private static kg_0 a(esl_1 esl_12) {
        kg_0 kg_02 = kE.j();
        esm_2 esm_22 = esl_12.c();
        if (esm_22 != null) {
            kg_02.a(esm_22.a());
            kg_02.b(esm_22.c());
            kg_02.a(esm_22.b());
        }
        return kg_02;
    }
}

