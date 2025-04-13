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

public final class iQ
extends GeneratedMessageV3.Builder<iQ>
implements iR {
    private int a;
    private long b;
    private long c;
    private int d;
    private int e;
    private iu_1 f = null;
    private SingleFieldBuilderV3<iu_1, iw_1, ix_1> g;
    private long h;
    private long i;
    private iq_0 j = null;
    private SingleFieldBuilderV3<iq_0, is, it_0> k;
    private int l;
    private long m;
    private ic_1 n = null;
    private SingleFieldBuilderV3<ic_1, ie_0, if_0> o;
    private is_0 p = null;
    private SingleFieldBuilderV3<is_0, iu_0, iv_1> q;

    public static final Descriptors.Descriptor a() {
        return io_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.b.ensureFieldAccessorsInitialized(iO.class, iQ.class);
    }

    iQ() {
        this.Y();
    }

    iQ(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.Y();
    }

    private void Y() {
        if (iO.J()) {
            this.Z();
            this.aa();
            this.ab();
            this.ac();
        }
    }

    public iQ D() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        if (this.g == null) {
            this.f = null;
        } else {
            this.g.clear();
        }
        this.a &= 0xFFFFFFEF;
        this.h = 0L;
        this.a &= 0xFFFFFFDF;
        this.i = 0L;
        this.a &= 0xFFFFFFBF;
        if (this.k == null) {
            this.j = null;
        } else {
            this.k.clear();
        }
        this.a &= 0xFFFFFF7F;
        this.l = 0;
        this.a &= 0xFFFFFEFF;
        this.m = 0L;
        this.a &= 0xFFFFFDFF;
        if (this.o == null) {
            this.n = null;
        } else {
            this.o.clear();
        }
        this.a &= 0xFFFFFBFF;
        if (this.q == null) {
            this.p = null;
        } else {
            this.q.clear();
        }
        this.a &= 0xFFFFF7FF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return io_0.a;
    }

    public iO E() {
        return iO.G();
    }

    public iO F() {
        iO iO2 = this.G();
        if (!iO2.isInitialized()) {
            throw iQ.newUninitializedMessageException((Message)iO2);
        }
        return iO2;
    }

    public iO G() {
        iO iO2 = new iO(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        iO2.p = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        iO2.q = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        iO2.r = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        iO2.s = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        iO2.t = this.g == null ? this.f : (iu_1)this.g.build();
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        iO2.u = this.h;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        iO2.v = this.i;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        iO2.w = this.k == null ? this.j : (iq_0)this.k.build();
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        iO2.x = this.l;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        iO2.y = this.m;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        iO2.z = this.o == null ? this.n : (ic_1)this.o.build();
        if ((n & 0x800) == 2048) {
            n2 |= 0x800;
        }
        iO2.A = this.q == null ? this.p : (is_0)this.q.build();
        iO2.o = n2;
        this.onBuilt();
        return iO2;
    }

    public iQ H() {
        return (iQ)super.clone();
    }

    public iQ a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (iQ)super.setField(fieldDescriptor, object);
    }

    public iQ a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (iQ)super.clearField(fieldDescriptor);
    }

    public iQ a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (iQ)super.clearOneof(oneofDescriptor);
    }

    public iQ a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (iQ)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public iQ b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (iQ)super.addRepeatedField(fieldDescriptor, object);
    }

    public iQ a(Message message) {
        if (message instanceof iO) {
            return this.a((iO)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public iQ a(iO iO2) {
        if (iO2 == iO.G()) {
            return this;
        }
        if (iO2.b()) {
            this.a(iO2.c());
        }
        if (iO2.d()) {
            this.b(iO2.e());
        }
        if (iO2.f()) {
            this.a(iO2.g());
        }
        if (iO2.h()) {
            this.b(iO2.i());
        }
        if (iO2.j()) {
            this.b(iO2.k());
        }
        if (iO2.m()) {
            this.c(iO2.n());
        }
        if (iO2.o()) {
            this.d(iO2.p());
        }
        if (iO2.q()) {
            this.b(iO2.r());
        }
        if (iO2.t()) {
            this.c(iO2.u());
        }
        if (iO2.v()) {
            this.e(iO2.w());
        }
        if (iO2.x()) {
            this.b(iO2.y());
        }
        if (iO2.A()) {
            this.b(iO2.B());
        }
        this.b(iO.b(iO2));
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
        if (!this.h()) {
            return false;
        }
        if (this.j() && !this.k().isInitialized()) {
            return false;
        }
        if (this.q() && !this.r().isInitialized()) {
            return false;
        }
        return !this.x() || this.y().isInitialized();
    }

    public iQ a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        iO iO2 = null;
        try {
            iO2 = (iO)iO.m.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            iO2 = (iO)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (iO2 != null) {
                this.a(iO2);
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

    public iQ a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public iQ I() {
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
    public long e() {
        return this.c;
    }

    public iQ b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public iQ J() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
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

    public iQ a(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public iQ K() {
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
    public int i() {
        return this.e;
    }

    public iQ b(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public iQ L() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public iu_1 k() {
        if (this.g == null) {
            return this.f == null ? iu_1.k() : this.f;
        }
        return (iu_1)this.g.getMessage();
    }

    public iQ a(iu_1 iu_12) {
        if (this.g == null) {
            if (iu_12 == null) {
                throw new NullPointerException();
            }
            this.f = iu_12;
            this.onChanged();
        } else {
            this.g.setMessage((AbstractMessage)iu_12);
        }
        this.a |= 0x10;
        return this;
    }

    public iQ a(iw_1 iw_12) {
        if (this.g == null) {
            this.f = iw_12.j();
            this.onChanged();
        } else {
            this.g.setMessage((AbstractMessage)iw_12.j());
        }
        this.a |= 0x10;
        return this;
    }

    public iQ b(iu_1 iu_12) {
        if (this.g == null) {
            this.f = (this.a & 0x10) == 16 && this.f != null && this.f != iu_1.k() ? iu_1.a(this.f).a(iu_12).k() : iu_12;
            this.onChanged();
        } else {
            this.g.mergeFrom((AbstractMessage)iu_12);
        }
        this.a |= 0x10;
        return this;
    }

    public iQ M() {
        if (this.g == null) {
            this.f = null;
            this.onChanged();
        } else {
            this.g.clear();
        }
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public iw_1 N() {
        this.a |= 0x10;
        this.onChanged();
        return (iw_1)this.Z().getBuilder();
    }

    @Override
    public ix_1 l() {
        if (this.g != null) {
            return (ix_1)this.g.getMessageOrBuilder();
        }
        return this.f == null ? iu_1.k() : this.f;
    }

    private SingleFieldBuilderV3<iu_1, iw_1, ix_1> Z() {
        if (this.g == null) {
            this.g = new SingleFieldBuilderV3((AbstractMessage)this.k(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.f = null;
        }
        return this.g;
    }

    @Override
    public boolean m() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public long n() {
        return this.h;
    }

    public iQ c(long l) {
        this.a |= 0x20;
        this.h = l;
        this.onChanged();
        return this;
    }

    public iQ O() {
        this.a &= 0xFFFFFFDF;
        this.h = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean o() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public long p() {
        return this.i;
    }

    public iQ d(long l) {
        this.a |= 0x40;
        this.i = l;
        this.onChanged();
        return this;
    }

    public iQ P() {
        this.a &= 0xFFFFFFBF;
        this.i = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean q() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public iq_0 r() {
        if (this.k == null) {
            return this.j == null ? iq_0.ak() : this.j;
        }
        return (iq_0)this.k.getMessage();
    }

    public iQ a(iq_0 iq_02) {
        if (this.k == null) {
            if (iq_02 == null) {
                throw new NullPointerException();
            }
            this.j = iq_02;
            this.onChanged();
        } else {
            this.k.setMessage((AbstractMessage)iq_02);
        }
        this.a |= 0x80;
        return this;
    }

    public iQ a(is is2) {
        if (this.k == null) {
            this.j = is2.aj();
            this.onChanged();
        } else {
            this.k.setMessage((AbstractMessage)is2.aj());
        }
        this.a |= 0x80;
        return this;
    }

    public iQ b(iq_0 iq_02) {
        if (this.k == null) {
            this.j = (this.a & 0x80) == 128 && this.j != null && this.j != iq_0.ak() ? iq_0.a(this.j).a(iq_02).ak() : iq_02;
            this.onChanged();
        } else {
            this.k.mergeFrom((AbstractMessage)iq_02);
        }
        this.a |= 0x80;
        return this;
    }

    public iQ Q() {
        if (this.k == null) {
            this.j = null;
            this.onChanged();
        } else {
            this.k.clear();
        }
        this.a &= 0xFFFFFF7F;
        return this;
    }

    public is R() {
        this.a |= 0x80;
        this.onChanged();
        return (is)this.aa().getBuilder();
    }

    @Override
    public it_0 s() {
        if (this.k != null) {
            return (it_0)this.k.getMessageOrBuilder();
        }
        return this.j == null ? iq_0.ak() : this.j;
    }

    private SingleFieldBuilderV3<iq_0, is, it_0> aa() {
        if (this.k == null) {
            this.k = new SingleFieldBuilderV3((AbstractMessage)this.r(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.j = null;
        }
        return this.k;
    }

    @Override
    public boolean t() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public int u() {
        return this.l;
    }

    public iQ c(int n) {
        this.a |= 0x100;
        this.l = n;
        this.onChanged();
        return this;
    }

    public iQ S() {
        this.a &= 0xFFFFFEFF;
        this.l = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean v() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public long w() {
        return this.m;
    }

    public iQ e(long l) {
        this.a |= 0x200;
        this.m = l;
        this.onChanged();
        return this;
    }

    public iQ T() {
        this.a &= 0xFFFFFDFF;
        this.m = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean x() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public ic_1 y() {
        if (this.o == null) {
            return this.n == null ? ic_1.p() : this.n;
        }
        return (ic_1)this.o.getMessage();
    }

    public iQ a(ic_1 ic_12) {
        if (this.o == null) {
            if (ic_12 == null) {
                throw new NullPointerException();
            }
            this.n = ic_12;
            this.onChanged();
        } else {
            this.o.setMessage((AbstractMessage)ic_12);
        }
        this.a |= 0x400;
        return this;
    }

    public iQ a(ie_0 ie_02) {
        if (this.o == null) {
            this.n = ie_02.o();
            this.onChanged();
        } else {
            this.o.setMessage((AbstractMessage)ie_02.o());
        }
        this.a |= 0x400;
        return this;
    }

    public iQ b(ic_1 ic_12) {
        if (this.o == null) {
            this.n = (this.a & 0x400) == 1024 && this.n != null && this.n != ic_1.p() ? ic_1.a(this.n).a(ic_12).p() : ic_12;
            this.onChanged();
        } else {
            this.o.mergeFrom((AbstractMessage)ic_12);
        }
        this.a |= 0x400;
        return this;
    }

    public iQ U() {
        if (this.o == null) {
            this.n = null;
            this.onChanged();
        } else {
            this.o.clear();
        }
        this.a &= 0xFFFFFBFF;
        return this;
    }

    public ie_0 V() {
        this.a |= 0x400;
        this.onChanged();
        return (ie_0)this.ab().getBuilder();
    }

    @Override
    public if_0 z() {
        if (this.o != null) {
            return (if_0)this.o.getMessageOrBuilder();
        }
        return this.n == null ? ic_1.p() : this.n;
    }

    private SingleFieldBuilderV3<ic_1, ie_0, if_0> ab() {
        if (this.o == null) {
            this.o = new SingleFieldBuilderV3((AbstractMessage)this.y(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.n = null;
        }
        return this.o;
    }

    @Override
    public boolean A() {
        return (this.a & 0x800) == 2048;
    }

    @Override
    public is_0 B() {
        if (this.q == null) {
            return this.p == null ? is_0.o() : this.p;
        }
        return (is_0)this.q.getMessage();
    }

    public iQ a(is_0 is_02) {
        if (this.q == null) {
            if (is_02 == null) {
                throw new NullPointerException();
            }
            this.p = is_02;
            this.onChanged();
        } else {
            this.q.setMessage((AbstractMessage)is_02);
        }
        this.a |= 0x800;
        return this;
    }

    public iQ a(iu_0 iu_02) {
        if (this.q == null) {
            this.p = iu_02.n();
            this.onChanged();
        } else {
            this.q.setMessage((AbstractMessage)iu_02.n());
        }
        this.a |= 0x800;
        return this;
    }

    public iQ b(is_0 is_02) {
        if (this.q == null) {
            this.p = (this.a & 0x800) == 2048 && this.p != null && this.p != is_0.o() ? is_0.a(this.p).a(is_02).o() : is_02;
            this.onChanged();
        } else {
            this.q.mergeFrom((AbstractMessage)is_02);
        }
        this.a |= 0x800;
        return this;
    }

    public iQ W() {
        if (this.q == null) {
            this.p = null;
            this.onChanged();
        } else {
            this.q.clear();
        }
        this.a &= 0xFFFFF7FF;
        return this;
    }

    public iu_0 X() {
        this.a |= 0x800;
        this.onChanged();
        return (iu_0)this.ac().getBuilder();
    }

    @Override
    public iv_1 C() {
        if (this.q != null) {
            return (iv_1)this.q.getMessageOrBuilder();
        }
        return this.p == null ? is_0.o() : this.p;
    }

    private SingleFieldBuilderV3<is_0, iu_0, iv_1> ac() {
        if (this.q == null) {
            this.q = new SingleFieldBuilderV3((AbstractMessage)this.B(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.p = null;
        }
        return this.q;
    }

    public final iQ a(UnknownFieldSet unknownFieldSet) {
        return (iQ)super.setUnknownFields(unknownFieldSet);
    }

    public final iQ b(UnknownFieldSet unknownFieldSet) {
        return (iQ)super.mergeUnknownFields(unknownFieldSet);
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
        return this.D();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.H();
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
        return this.D();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.H();
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
        return this.H();
    }

    public /* synthetic */ Message buildPartial() {
        return this.G();
    }

    public /* synthetic */ Message build() {
        return this.F();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.D();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.H();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.G();
    }

    public /* synthetic */ MessageLite build() {
        return this.F();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.D();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.E();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.E();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.H();
    }

    public /* synthetic */ Object clone() {
        return this.H();
    }
}

