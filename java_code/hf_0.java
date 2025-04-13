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

/*
 * Renamed from hF
 */
public final class hf_0
extends GeneratedMessageV3.Builder<hf_0>
implements hG {
    private int a;
    private int b;
    private int c = 1;
    private long d;
    private int e;
    private long f;
    private int g;
    private int h;
    private hn_0 i = null;
    private SingleFieldBuilderV3<hn_0, hp_0, hv_0> j;
    private long k;
    private int l;
    private int m;

    public static final Descriptors.Descriptor a() {
        return hl_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hl_0.b.ensureFieldAccessorsInitialized(hD.class, hf_0.class);
    }

    hf_0() {
        this.P();
    }

    hf_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.P();
    }

    private void P() {
        if (hD.E()) {
            this.Q();
        }
    }

    public hf_0 y() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 1;
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = 0L;
        this.a &= 0xFFFFFFEF;
        this.g = 0;
        this.a &= 0xFFFFFFDF;
        this.h = 0;
        this.a &= 0xFFFFFFBF;
        if (this.j == null) {
            this.i = null;
        } else {
            this.j.clear();
        }
        this.a &= 0xFFFFFF7F;
        this.k = 0L;
        this.a &= 0xFFFFFEFF;
        this.l = 0;
        this.a &= 0xFFFFFDFF;
        this.m = 0;
        this.a &= 0xFFFFFBFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hl_0.a;
    }

    public hD z() {
        return hD.B();
    }

    public hD A() {
        hD hD2 = this.B();
        if (!hD2.isInitialized()) {
            throw hf_0.newUninitializedMessageException((Message)hD2);
        }
        return hD2;
    }

    public hD B() {
        hD hD2 = new hD(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        hD2.o = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        hD2.p = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        hD2.q = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        hD2.r = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        hD2.s = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        hD2.t = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        hD2.u = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        hD2.v = this.j == null ? this.i : (hn_0)this.j.build();
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        hD2.w = this.k;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        hD2.x = this.l;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        hD2.y = this.m;
        hD2.n = n2;
        this.onBuilt();
        return hD2;
    }

    public hf_0 C() {
        return (hf_0)super.clone();
    }

    public hf_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hf_0)super.setField(fieldDescriptor, object);
    }

    public hf_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hf_0)super.clearField(fieldDescriptor);
    }

    public hf_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hf_0)super.clearOneof(oneofDescriptor);
    }

    public hf_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hf_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hf_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hf_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public hf_0 a(Message message) {
        if (message instanceof hD) {
            return this.a((hD)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hf_0 a(hD hD2) {
        if (hD2 == hD.B()) {
            return this;
        }
        if (hD2.b()) {
            this.a(hD2.c());
        }
        if (hD2.d()) {
            this.a(hD2.e());
        }
        if (hD2.f()) {
            this.a(hD2.g());
        }
        if (hD2.h()) {
            this.b(hD2.i());
        }
        if (hD2.j()) {
            this.b(hD2.k());
        }
        if (hD2.l()) {
            this.c(hD2.m());
        }
        if (hD2.n()) {
            this.d(hD2.o());
        }
        if (hD2.p()) {
            this.b(hD2.q());
        }
        if (hD2.s()) {
            this.c(hD2.t());
        }
        if (hD2.u()) {
            this.e(hD2.v());
        }
        if (hD2.w()) {
            this.f(hD2.x());
        }
        this.b(hD.b(hD2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        return !this.p() || this.q().isInitialized();
    }

    public hf_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hD hD2 = null;
        try {
            hD2 = (hD)hD.l.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hD2 = (hD)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hD2 != null) {
                this.a(hD2);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public hf_0 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public hf_0 D() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public hw_1 e() {
        hw_1 hw_12 = hw_1.a(this.c);
        return hw_12 == null ? hw_1.a : hw_12;
    }

    public hf_0 a(hw_1 hw_12) {
        if (hw_12 == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = hw_12.getNumber();
        this.onChanged();
        return this;
    }

    public hf_0 E() {
        this.a &= 0xFFFFFFFD;
        this.c = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public long g() {
        return this.d;
    }

    public hf_0 a(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public hf_0 F() {
        this.a &= 0xFFFFFFFB;
        this.d = 0L;
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

    public hf_0 b(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public hf_0 G() {
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
    public long k() {
        return this.f;
    }

    public hf_0 b(long l) {
        this.a |= 0x10;
        this.f = l;
        this.onChanged();
        return this;
    }

    public hf_0 H() {
        this.a &= 0xFFFFFFEF;
        this.f = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public int m() {
        return this.g;
    }

    public hf_0 c(int n) {
        this.a |= 0x20;
        this.g = n;
        this.onChanged();
        return this;
    }

    public hf_0 I() {
        this.a &= 0xFFFFFFDF;
        this.g = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public int o() {
        return this.h;
    }

    public hf_0 d(int n) {
        this.a |= 0x40;
        this.h = n;
        this.onChanged();
        return this;
    }

    public hf_0 J() {
        this.a &= 0xFFFFFFBF;
        this.h = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean p() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public hn_0 q() {
        if (this.j == null) {
            return this.i == null ? hn_0.h() : this.i;
        }
        return (hn_0)this.j.getMessage();
    }

    public hf_0 a(hn_0 hn_02) {
        if (this.j == null) {
            if (hn_02 == null) {
                throw new NullPointerException();
            }
            this.i = hn_02;
            this.onChanged();
        } else {
            this.j.setMessage((AbstractMessage)hn_02);
        }
        this.a |= 0x80;
        return this;
    }

    public hf_0 a(hp_0 hp_02) {
        if (this.j == null) {
            this.i = hp_02.g();
            this.onChanged();
        } else {
            this.j.setMessage((AbstractMessage)hp_02.g());
        }
        this.a |= 0x80;
        return this;
    }

    public hf_0 b(hn_0 hn_02) {
        if (this.j == null) {
            this.i = (this.a & 0x80) == 128 && this.i != null && this.i != hn_0.h() ? hn_0.a(this.i).a(hn_02).h() : hn_02;
            this.onChanged();
        } else {
            this.j.mergeFrom((AbstractMessage)hn_02);
        }
        this.a |= 0x80;
        return this;
    }

    public hf_0 K() {
        if (this.j == null) {
            this.i = null;
            this.onChanged();
        } else {
            this.j.clear();
        }
        this.a &= 0xFFFFFF7F;
        return this;
    }

    public hp_0 L() {
        this.a |= 0x80;
        this.onChanged();
        return (hp_0)this.Q().getBuilder();
    }

    @Override
    public hv_0 r() {
        if (this.j != null) {
            return (hv_0)this.j.getMessageOrBuilder();
        }
        return this.i == null ? hn_0.h() : this.i;
    }

    private SingleFieldBuilderV3<hn_0, hp_0, hv_0> Q() {
        if (this.j == null) {
            this.j = new SingleFieldBuilderV3((AbstractMessage)this.q(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.i = null;
        }
        return this.j;
    }

    @Override
    public boolean s() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public long t() {
        return this.k;
    }

    public hf_0 c(long l) {
        this.a |= 0x100;
        this.k = l;
        this.onChanged();
        return this;
    }

    public hf_0 M() {
        this.a &= 0xFFFFFEFF;
        this.k = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean u() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public int v() {
        return this.l;
    }

    public hf_0 e(int n) {
        this.a |= 0x200;
        this.l = n;
        this.onChanged();
        return this;
    }

    public hf_0 N() {
        this.a &= 0xFFFFFDFF;
        this.l = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean w() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public int x() {
        return this.m;
    }

    public hf_0 f(int n) {
        this.a |= 0x400;
        this.m = n;
        this.onChanged();
        return this;
    }

    public hf_0 O() {
        this.a &= 0xFFFFFBFF;
        this.m = 0;
        this.onChanged();
        return this;
    }

    public final hf_0 a(UnknownFieldSet unknownFieldSet) {
        return (hf_0)super.setUnknownFields(unknownFieldSet);
    }

    public final hf_0 b(UnknownFieldSet unknownFieldSet) {
        return (hf_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.y();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.C();
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
        return this.y();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.C();
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
        return this.C();
    }

    public /* synthetic */ Message buildPartial() {
        return this.B();
    }

    public /* synthetic */ Message build() {
        return this.A();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.C();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.B();
    }

    public /* synthetic */ MessageLite build() {
        return this.A();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.y();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.z();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.z();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.C();
    }

    public /* synthetic */ Object clone() {
        return this.C();
    }
}

