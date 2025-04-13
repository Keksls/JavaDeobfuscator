/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.SingleReference
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.shopi.client.model.ArticlePaymentModeOneOf;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.SingleReference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSF
 */
public class bsf_0
extends bss_0<String, SingleReference> {
    private final Object N;

    public bsf_0(String string, @Nullable String string2, String string3, String string4, String string5, Double d2, Double d3, bsz_1 bsz_12, Object object, Integer n, ArrayList<bSJ> arrayList, List<SingleReference> list, ArrayList<bsg_2> arrayList2, ArrayList<bse_0> arrayList3, wt_0 wt_02, Double d4, Double d5, bsz_1 bsz_13) {
        super(string, string2, string3, string4, string5, d2, d3, bsz_12, n, arrayList, list, arrayList2, arrayList3, wt_02, d4, d5, bsz_13);
        this.N = object;
    }

    public Object w() {
        return this.N;
    }

    @Override
    @Nullable
    protected String n() {
        return this.B != null && (this.B > 0.0 || this.N == ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE) ? bae.h().a(this.B) : null;
    }

    @Override
    public boolean a(bsw_0 bsw_02) {
        switch (bsw_02) {
            case b: {
                return true;
            }
            case a: {
                return this.K.stream().anyMatch(singleReference -> singleReference.getReference().getDiscriminator() == ReferenceOneOf.DiscriminatorEnum.OGRINETOKENREFERENCE);
            }
        }
        return false;
    }
}

