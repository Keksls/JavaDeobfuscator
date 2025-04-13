/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataOutputStream
 */
import com.google.common.io.LittleEndianDataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from IK
 */
public class ik_1 {
    private final kh_1 a;
    private final mo_2 b;
    private final long c;

    public ik_1(kh_1 kh_12, mo_2 mo_22, long l) {
        this.a = kh_12;
        this.b = mo_22;
        this.c = l;
    }

    public final void a(String string) {
        try (LittleEndianDataOutputStream littleEndianDataOutputStream = new LittleEndianDataOutputStream((OutputStream)new FileOutputStream(string));){
            this.a((DataOutput)littleEndianDataOutputStream);
        }
    }

    public final void a(DataOutput dataOutput) {
        lx_2 lx_22 = (lx_2)this.a.b().a().get(0).b();
        this.a(dataOutput, lx_22);
    }

    private void a(DataOutput dataOutput, lx_2 lx_22) {
        dataOutput.writeBoolean(lx_22.c());
        dataOutput.writeBoolean(lx_22.d());
        dataOutput.writeBoolean(lx_22.e());
        dataOutput.writeInt(lx_22.g());
        dataOutput.writeInt(lx_22.h());
        dataOutput.writeLong(this.c);
        dataOutput.writeShort((short)(lx_22.a()[0] & 0xFFFF));
        dataOutput.writeShort((short)(lx_22.a()[1] & 0xFFFF));
        dataOutput.writeByte(lx_22.f());
        this.a(dataOutput, (kk_1)lx_22);
    }

    private void a(DataOutput dataOutput, kk_1 kk_12) {
        List list = kk_12.b().a().stream().filter(arg_0 -> if_1.a(kl_1.x).apply(arg_0)).map(arg_0 -> if_1.c().apply(arg_0)).collect(Collectors.toList());
        dataOutput.writeByte((byte)list.size());
        for (lw_2 lw_22 : list) {
            this.a(dataOutput, lw_22);
        }
    }

    private void a(DataOutput dataOutput, lw_2 lw_22) {
        dataOutput.writeByte((byte)lw_22.a()[0]);
        dataOutput.writeByte((byte)lw_22.a()[1]);
        byte[] byArray = this.a(lw_22);
        dataOutput.writeInt(byArray.length);
        dataOutput.write(byArray);
    }

    private byte[] a(lw_2 lw_22) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        LittleEndianDataOutputStream littleEndianDataOutputStream = new LittleEndianDataOutputStream((OutputStream)byteArrayOutputStream);
        iv_2 iv_22 = new iv_2(lw_22);
        iv_22.a((DataOutput)littleEndianDataOutputStream);
        this.a(littleEndianDataOutputStream, (kk_1)lw_22);
        this.b(littleEndianDataOutputStream, lw_22);
        this.d(littleEndianDataOutputStream, lw_22);
        this.a((DataOutput)littleEndianDataOutputStream, (kk_1)lw_22);
        littleEndianDataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private void a(LittleEndianDataOutputStream littleEndianDataOutputStream, kk_1 kk_12) {
        List list = kk_12.b().a().stream().filter(arg_0 -> if_1.a(kl_1.d, kl_1.p).apply(arg_0)).collect(Collectors.toList());
        littleEndianDataOutputStream.writeByte(list.size());
        for (lk_2 lk_22 : list) {
            jg_1 jg_12 = this.a(lk_22);
            jg_12.a((DataOutput)littleEndianDataOutputStream);
        }
    }

    private void b(LittleEndianDataOutputStream littleEndianDataOutputStream, kk_1 kk_12) {
        List list = kk_12.b().a().stream().filter(arg_0 -> if_1.a(kl_1.f, kl_1.q, kl_1.o, kl_1.e, kl_1.j, kl_1.m, kl_1.i, kl_1.t, kl_1.g, kl_1.s, kl_1.u, kl_1.v, kl_1.h).apply(arg_0)).collect(Collectors.toList());
        littleEndianDataOutputStream.writeByte(list.size());
        for (lk_2 lk_22 : list) {
            jg_1 jg_12 = this.a(lk_22);
            jg_12.a((DataOutput)littleEndianDataOutputStream);
            this.c(littleEndianDataOutputStream, (kk_1)((Object)lk_22.b()));
        }
    }

    private void c(LittleEndianDataOutputStream littleEndianDataOutputStream, kk_1 kk_12) {
        List list = kk_12.b().a().stream().filter(arg_0 -> if_1.a(kl_1.k, kl_1.n).apply(arg_0)).collect(Collectors.toList());
        littleEndianDataOutputStream.writeByte(list.size());
        for (lk_2 lk_22 : list) {
            jg_1 jg_12 = this.a(lk_22);
            jg_12.a((DataOutput)littleEndianDataOutputStream);
        }
    }

    private void d(LittleEndianDataOutputStream littleEndianDataOutputStream, kk_1 kk_12) {
        List list = kk_12.b().a().stream().filter(arg_0 -> if_1.a(kl_1.r).apply(arg_0)).collect(Collectors.toList());
        littleEndianDataOutputStream.writeByte(list.size());
        for (lk_2 lk_22 : list) {
            iz_2 iz_22 = new iz_2((lb_2)lk_22.b());
            iz_22.a((DataOutput)littleEndianDataOutputStream);
            this.b(littleEndianDataOutputStream, (kk_1)((Object)lk_22.b()));
        }
    }

    private jg_1 a(lk_2 lk_22) {
        jg_1 jg_12;
        switch (lk_22.a().a()) {
            case d: {
                jg_12 = new io_1((lp_2)lk_22.b());
                break;
            }
            case p: {
                jg_12 = new ip_1((lq_2)lk_22.b(), this.b.a(((lq_2)lk_22.b()).a()));
                break;
            }
            case f: {
                jg_12 = new in_1((ln_2)lk_22.b());
                break;
            }
            case q: {
                jg_12 = new iq_1((lr_2)lk_22.b());
                break;
            }
            case o: {
                jg_12 = new ir_1((ls_2)lk_22.b());
                break;
            }
            case e: {
                jg_12 = new is_1((lt_2)lk_22.b());
                break;
            }
            case j: {
                jg_12 = new it_1((lu_2)lk_22.b());
                break;
            }
            case m: {
                jg_12 = new iu_2((lv_2)lk_22.b());
                break;
            }
            case i: {
                jg_12 = new iw_2((lz_2)lk_22.b());
                break;
            }
            case t: {
                jg_12 = new iy_2((lc_2)lk_22.b());
                break;
            }
            case g: {
                jg_12 = new ja_1((ld_2)lk_22.b());
                break;
            }
            case s: {
                jg_12 = new jc_1((lh_2)lk_22.b());
                break;
            }
            case u: {
                jg_12 = new je_1((li_2)lk_22.b());
                break;
            }
            case v: {
                jg_12 = new jd_1((lj_2)lk_22.b());
                break;
            }
            case h: {
                jg_12 = new jf_1((lk_1)lk_22.b());
                break;
            }
            case k: {
                jg_12 = new ix_2((la_2)lk_22.b());
                break;
            }
            case n: {
                jg_12 = new jb_1((lf_2)lk_22.b());
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown tag " + lk_22.a().a());
            }
        }
        return jg_12;
    }
}

