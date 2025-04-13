/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

public final class lg
extends GeneratedMessageV3.Builder<lg>
implements lp {
    private int a;
    private long b;
    private int c;
    private int d;
    private lg_0 e = null;
    private SingleFieldBuilderV3<lg_0, li_0, lJ> f;
    private ly g = null;
    private SingleFieldBuilderV3<ly, la_0, lb_0> h;
    private lk_0 i = null;
    private SingleFieldBuilderV3<lk_0, lM, lV> j;
    private la k = null;
    private SingleFieldBuilderV3<la, lc, ld_0> l;
    private lh_0 m = null;
    private SingleFieldBuilderV3<lh_0, lj_0, lk> n;
    private ll o = null;
    private SingleFieldBuilderV3<ll, ln, lo> p;
    private lc_0 q = null;
    private SingleFieldBuilderV3<lc_0, lE, lf_0> r;
    private int s;

    public static final Descriptors.Descriptor a() {
        return kM.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.b.ensureFieldAccessorsInitialized(le_0.class, lg.class);
    }

    lg() {
        this.ab();
    }

    lg(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.ab();
    }

    private void ab() {
        if (le_0.K()) {
            this.ac();
            this.ad();
            this.ae();
            this.af();
            this.ag();
            this.ah();
            this.ai();
        }
    }

    public lg E() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        if (this.f == null) {
            this.e = null;
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFF7;
        if (this.h == null) {
            this.g = null;
        } else {
            this.h.clear();
        }
        this.a &= 0xFFFFFFEF;
        if (this.j == null) {
            this.i = null;
        } else {
            this.j.clear();
        }
        this.a &= 0xFFFFFFDF;
        if (this.l == null) {
            this.k = null;
        } else {
            this.l.clear();
        }
        this.a &= 0xFFFFFFBF;
        if (this.n == null) {
            this.m = null;
        } else {
            this.n.clear();
        }
        this.a &= 0xFFFFFF7F;
        if (this.p == null) {
            this.o = null;
        } else {
            this.p.clear();
        }
        this.a &= 0xFFFFFEFF;
        if (this.r == null) {
            this.q = null;
        } else {
            this.r.clear();
        }
        this.a &= 0xFFFFFDFF;
        this.s = 0;
        this.a &= 0xFFFFFBFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kM.a;
    }

    public le_0 F() {
        return le_0.H();
    }

    public le_0 G() {
        le_0 le_02 = this.H();
        if (!le_02.isInitialized()) {
            throw lg.newUninitializedMessageException((Message)le_02);
        }
        return le_02;
    }

    public le_0 H() {
        le_0 le_02 = new le_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        le_02.o = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        le_02.p = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        le_02.q = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        le_02.r = this.f == null ? this.e : (lg_0)this.f.build();
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        le_02.s = this.h == null ? this.g : (ly)this.h.build();
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        le_02.t = this.j == null ? this.i : (lk_0)this.j.build();
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        le_02.u = this.l == null ? this.k : (la)this.l.build();
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        le_02.v = this.n == null ? this.m : (lh_0)this.n.build();
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        le_02.w = this.p == null ? this.o : (ll)this.p.build();
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        le_02.x = this.r == null ? this.q : (lc_0)this.r.build();
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        le_02.y = this.s;
        le_02.n = n2;
        this.onBuilt();
        return le_02;
    }

    public lg I() {
        return (lg)super.clone();
    }

    public lg a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lg)super.setField(fieldDescriptor, object);
    }

    public lg a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lg)super.clearField(fieldDescriptor);
    }

    public lg a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lg)super.clearOneof(oneofDescriptor);
    }

    public lg a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lg)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lg b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lg)super.addRepeatedField(fieldDescriptor, object);
    }

    public lg a(Message message) {
        if (message instanceof le_0) {
            return this.a((le_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lg a(le_0 le_02) {
        if (le_02 == le_0.H()) {
            return this;
        }
        if (le_02.b()) {
            this.a(le_02.c());
        }
        if (le_02.d()) {
            this.a(le_02.e());
        }
        if (le_02.f()) {
            this.b(le_02.g());
        }
        if (le_02.h()) {
            this.b(le_02.i());
        }
        if (le_02.k()) {
            this.b(le_02.l());
        }
        if (le_02.n()) {
            this.b(le_02.o());
        }
        if (le_02.q()) {
            this.b(le_02.r());
        }
        if (le_02.t()) {
            this.b(le_02.u());
        }
        if (le_02.w()) {
            this.b(le_02.x());
        }
        if (le_02.z()) {
            this.b(le_02.A());
        }
        if (le_02.C()) {
            this.c(le_02.D());
        }
        this.b(le_0.b(le_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        if (this.h() && !this.i().isInitialized()) {
            return false;
        }
        if (this.k() && !this.l().isInitialized()) {
            return false;
        }
        if (this.n() && !this.o().isInitialized()) {
            return false;
        }
        if (this.q() && !this.r().isInitialized()) {
            return false;
        }
        if (this.t() && !this.u().isInitialized()) {
            return false;
        }
        if (this.w() && !this.x().isInitialized()) {
            return false;
        }
        return !this.z() || this.A().isInitialized();
    }

    public lg a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        le_0 le_02 = null;
        try {
            le_02 = (le_0)le_0.l.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            le_02 = (le_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (le_02 != null) {
                this.a(le_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public lg a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public lg J() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public int e() {
        return this.c;
    }

    public lg a(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public lg K() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public int g() {
        return this.d;
    }

    public lg b(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public lg L() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public lg_0 i() {
        if (this.f == null) {
            return this.e == null ? lg_0.z() : this.e;
        }
        return (lg_0)this.f.getMessage();
    }

    public lg a(lg_0 lg_02) {
        if (this.f == null) {
            if (lg_02 == null) {
                throw new NullPointerException();
            }
            this.e = lg_02;
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)lg_02);
        }
        this.a |= 8;
        return this;
    }

    public lg a(li_0 li_02) {
        if (this.f == null) {
            this.e = li_02.y();
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)li_02.y());
        }
        this.a |= 8;
        return this;
    }

    public lg b(lg_0 lg_02) {
        if (this.f == null) {
            this.e = (this.a & 8) == 8 && this.e != null && this.e != lg_0.z() ? lg_0.a(this.e).a(lg_02).z() : lg_02;
            this.onChanged();
        } else {
            this.f.mergeFrom((AbstractMessage)lg_02);
        }
        this.a |= 8;
        return this;
    }

    public lg M() {
        if (this.f == null) {
            this.e = null;
            this.onChanged();
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public li_0 N() {
        this.a |= 8;
        this.onChanged();
        return (li_0)this.ac().getBuilder();
    }

    @Override
    public lJ j() {
        if (this.f != null) {
            return (lJ)this.f.getMessageOrBuilder();
        }
        return this.e == null ? lg_0.z() : this.e;
    }

    private SingleFieldBuilderV3<lg_0, li_0, lJ> ac() {
        if (this.f == null) {
            this.f = new SingleFieldBuilderV3((AbstractMessage)this.i(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public ly l() {
        if (this.h == null) {
            return this.g == null ? ly.i() : this.g;
        }
        return (ly)this.h.getMessage();
    }

    public lg a(ly ly2) {
        if (this.h == null) {
            if (ly2 == null) {
                throw new NullPointerException();
            }
            this.g = ly2;
            this.onChanged();
        } else {
            this.h.setMessage((AbstractMessage)ly2);
        }
        this.a |= 0x10;
        return this;
    }

    public lg a(la_0 la_02) {
        if (this.h == null) {
            this.g = la_02.h();
            this.onChanged();
        } else {
            this.h.setMessage((AbstractMessage)la_02.h());
        }
        this.a |= 0x10;
        return this;
    }

    public lg b(ly ly2) {
        if (this.h == null) {
            this.g = (this.a & 0x10) == 16 && this.g != null && this.g != ly.i() ? ly.a(this.g).a(ly2).i() : ly2;
            this.onChanged();
        } else {
            this.h.mergeFrom((AbstractMessage)ly2);
        }
        this.a |= 0x10;
        return this;
    }

    public lg O() {
        if (this.h == null) {
            this.g = null;
            this.onChanged();
        } else {
            this.h.clear();
        }
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public la_0 P() {
        this.a |= 0x10;
        this.onChanged();
        return (la_0)this.ad().getBuilder();
    }

    @Override
    public lb_0 m() {
        if (this.h != null) {
            return (lb_0)this.h.getMessageOrBuilder();
        }
        return this.g == null ? ly.i() : this.g;
    }

    private SingleFieldBuilderV3<ly, la_0, lb_0> ad() {
        if (this.h == null) {
            this.h = new SingleFieldBuilderV3((AbstractMessage)this.l(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.g = null;
        }
        return this.h;
    }

    @Override
    public boolean n() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public lk_0 o() {
        if (this.j == null) {
            return this.i == null ? lk_0.q() : this.i;
        }
        return (lk_0)this.j.getMessage();
    }

    public lg a(lk_0 lk_02) {
        if (this.j == null) {
            if (lk_02 == null) {
                throw new NullPointerException();
            }
            this.i = lk_02;
            this.onChanged();
        } else {
            this.j.setMessage((AbstractMessage)lk_02);
        }
        this.a |= 0x20;
        return this;
    }

    public lg a(lM lM2) {
        if (this.j == null) {
            this.i = lM2.p();
            this.onChanged();
        } else {
            this.j.setMessage((AbstractMessage)lM2.p());
        }
        this.a |= 0x20;
        return this;
    }

    public lg b(lk_0 lk_02) {
        if (this.j == null) {
            this.i = (this.a & 0x20) == 32 && this.i != null && this.i != lk_0.q() ? lk_0.a(this.i).a(lk_02).q() : lk_02;
            this.onChanged();
        } else {
            this.j.mergeFrom((AbstractMessage)lk_02);
        }
        this.a |= 0x20;
        return this;
    }

    public lg Q() {
        if (this.j == null) {
            this.i = null;
            this.onChanged();
        } else {
            this.j.clear();
        }
        this.a &= 0xFFFFFFDF;
        return this;
    }

    public lM R() {
        this.a |= 0x20;
        this.onChanged();
        return (lM)this.ae().getBuilder();
    }

    @Override
    public lV p() {
        if (this.j != null) {
            return (lV)this.j.getMessageOrBuilder();
        }
        return this.i == null ? lk_0.q() : this.i;
    }

    private SingleFieldBuilderV3<lk_0, lM, lV> ae() {
        if (this.j == null) {
            this.j = new SingleFieldBuilderV3((AbstractMessage)this.o(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.i = null;
        }
        return this.j;
    }

    @Override
    public boolean q() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public la r() {
        if (this.l == null) {
            return this.k == null ? la.g() : this.k;
        }
        return (la)this.l.getMessage();
    }

    public lg a(la la2) {
        if (this.l == null) {
            if (la2 == null) {
                throw new NullPointerException();
            }
            this.k = la2;
            this.onChanged();
        } else {
            this.l.setMessage((AbstractMessage)la2);
        }
        this.a |= 0x40;
        return this;
    }

    public lg a(lc lc2) {
        if (this.l == null) {
            this.k = lc2.f();
            this.onChanged();
        } else {
            this.l.setMessage((AbstractMessage)lc2.f());
        }
        this.a |= 0x40;
        return this;
    }

    public lg b(la la2) {
        if (this.l == null) {
            this.k = (this.a & 0x40) == 64 && this.k != null && this.k != la.g() ? la.a(this.k).a(la2).g() : la2;
            this.onChanged();
        } else {
            this.l.mergeFrom((AbstractMessage)la2);
        }
        this.a |= 0x40;
        return this;
    }

    public lg S() {
        if (this.l == null) {
            this.k = null;
            this.onChanged();
        } else {
            this.l.clear();
        }
        this.a &= 0xFFFFFFBF;
        return this;
    }

    public lc T() {
        this.a |= 0x40;
        this.onChanged();
        return (lc)this.af().getBuilder();
    }

    @Override
    public ld_0 s() {
        if (this.l != null) {
            return (ld_0)this.l.getMessageOrBuilder();
        }
        return this.k == null ? la.g() : this.k;
    }

    private SingleFieldBuilderV3<la, lc, ld_0> af() {
        if (this.l == null) {
            this.l = new SingleFieldBuilderV3((AbstractMessage)this.r(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.k = null;
        }
        return this.l;
    }

    @Override
    public boolean t() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public lh_0 u() {
        if (this.n == null) {
            return this.m == null ? lh_0.i() : this.m;
        }
        return (lh_0)this.n.getMessage();
    }

    public lg a(lh_0 lh_02) {
        if (this.n == null) {
            if (lh_02 == null) {
                throw new NullPointerException();
            }
            this.m = lh_02;
            this.onChanged();
        } else {
            this.n.setMessage((AbstractMessage)lh_02);
        }
        this.a |= 0x80;
        return this;
    }

    public lg a(lj_0 lj_02) {
        if (this.n == null) {
            this.m = lj_02.h();
            this.onChanged();
        } else {
            this.n.setMessage((AbstractMessage)lj_02.h());
        }
        this.a |= 0x80;
        return this;
    }

    public lg b(lh_0 lh_02) {
        if (this.n == null) {
            this.m = (this.a & 0x80) == 128 && this.m != null && this.m != lh_0.i() ? lh_0.a(this.m).a(lh_02).i() : lh_02;
            this.onChanged();
        } else {
            this.n.mergeFrom((AbstractMessage)lh_02);
        }
        this.a |= 0x80;
        return this;
    }

    public lg U() {
        if (this.n == null) {
            this.m = null;
            this.onChanged();
        } else {
            this.n.clear();
        }
        this.a &= 0xFFFFFF7F;
        return this;
    }

    public lj_0 V() {
        this.a |= 0x80;
        this.onChanged();
        return (lj_0)this.ag().getBuilder();
    }

    @Override
    public lk v() {
        if (this.n != null) {
            return (lk)this.n.getMessageOrBuilder();
        }
        return this.m == null ? lh_0.i() : this.m;
    }

    private SingleFieldBuilderV3<lh_0, lj_0, lk> ag() {
        if (this.n == null) {
            this.n = new SingleFieldBuilderV3((AbstractMessage)this.u(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.m = null;
        }
        return this.n;
    }

    @Override
    public boolean w() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public ll x() {
        if (this.p == null) {
            return this.o == null ? ll.i() : this.o;
        }
        return (ll)this.p.getMessage();
    }

    public lg a(ll ll2) {
        if (this.p == null) {
            if (ll2 == null) {
                throw new NullPointerException();
            }
            this.o = ll2;
            this.onChanged();
        } else {
            this.p.setMessage((AbstractMessage)ll2);
        }
        this.a |= 0x100;
        return this;
    }

    public lg a(ln ln2) {
        if (this.p == null) {
            this.o = ln2.h();
            this.onChanged();
        } else {
            this.p.setMessage((AbstractMessage)ln2.h());
        }
        this.a |= 0x100;
        return this;
    }

    public lg b(ll ll2) {
        if (this.p == null) {
            this.o = (this.a & 0x100) == 256 && this.o != null && this.o != ll.i() ? ll.a(this.o).a(ll2).i() : ll2;
            this.onChanged();
        } else {
            this.p.mergeFrom((AbstractMessage)ll2);
        }
        this.a |= 0x100;
        return this;
    }

    public lg W() {
        if (this.p == null) {
            this.o = null;
            this.onChanged();
        } else {
            this.p.clear();
        }
        this.a &= 0xFFFFFEFF;
        return this;
    }

    public ln X() {
        this.a |= 0x100;
        this.onChanged();
        return (ln)this.ah().getBuilder();
    }

    @Override
    public lo y() {
        if (this.p != null) {
            return (lo)this.p.getMessageOrBuilder();
        }
        return this.o == null ? ll.i() : this.o;
    }

    private SingleFieldBuilderV3<ll, ln, lo> ah() {
        if (this.p == null) {
            this.p = new SingleFieldBuilderV3((AbstractMessage)this.x(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.o = null;
        }
        return this.p;
    }

    @Override
    public boolean z() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public lc_0 A() {
        if (this.r == null) {
            return this.q == null ? lc_0.h() : this.q;
        }
        return (lc_0)this.r.getMessage();
    }

    public lg a(lc_0 lc_02) {
        if (this.r == null) {
            if (lc_02 == null) {
                throw new NullPointerException();
            }
            this.q = lc_02;
            this.onChanged();
        } else {
            this.r.setMessage((AbstractMessage)lc_02);
        }
        this.a |= 0x200;
        return this;
    }

    public lg a(lE lE2) {
        if (this.r == null) {
            this.q = lE2.g();
            this.onChanged();
        } else {
            this.r.setMessage((AbstractMessage)lE2.g());
        }
        this.a |= 0x200;
        return this;
    }

    public lg b(lc_0 lc_02) {
        if (this.r == null) {
            this.q = (this.a & 0x200) == 512 && this.q != null && this.q != lc_0.h() ? lc_0.a(this.q).a(lc_02).h() : lc_02;
            this.onChanged();
        } else {
            this.r.mergeFrom((AbstractMessage)lc_02);
        }
        this.a |= 0x200;
        return this;
    }

    public lg Y() {
        if (this.r == null) {
            this.q = null;
            this.onChanged();
        } else {
            this.r.clear();
        }
        this.a &= 0xFFFFFDFF;
        return this;
    }

    public lE Z() {
        this.a |= 0x200;
        this.onChanged();
        return (lE)this.ai().getBuilder();
    }

    @Override
    public lf_0 B() {
        if (this.r != null) {
            return (lf_0)this.r.getMessageOrBuilder();
        }
        return this.q == null ? lc_0.h() : this.q;
    }

    private SingleFieldBuilderV3<lc_0, lE, lf_0> ai() {
        if (this.r == null) {
            this.r = new SingleFieldBuilderV3((AbstractMessage)this.A(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.q = null;
        }
        return this.r;
    }

    @Override
    public boolean C() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public int D() {
        return this.s;
    }

    public lg c(int n) {
        this.a |= 0x400;
        this.s = n;
        this.onChanged();
        return this;
    }

    public lg aa() {
        this.a &= 0xFFFFFBFF;
        this.s = 0;
        this.onChanged();
        return this;
    }

    public final lg a(UnknownFieldSet unknownFieldSet) {
        return (lg)super.setUnknownFields(unknownFieldSet);
    }

    public final lg b(UnknownFieldSet unknownFieldSet) {
        return (lg)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.E();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.I();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.E();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.I();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.I();
    }

    public /* synthetic */ Message buildPartial() {
        return this.H();
    }

    public /* synthetic */ Message build() {
        return this.G();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.E();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.I();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.H();
    }

    public /* synthetic */ MessageLite build() {
        return this.G();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.E();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.F();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.F();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.I();
    }

    public /* synthetic */ Object clone() {
        return this.I();
    }
}

