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
 * Renamed from mo
 */
public final class mo_1
extends GeneratedMessageV3.Builder<mo_1>
implements mp_0 {
    private int a;
    private long b = -1L;
    private le_0 c = null;
    private SingleFieldBuilderV3<le_0, lg, lp> d;
    private my_0 e = null;
    private SingleFieldBuilderV3<my_0, mA, mB> f;
    private int g;
    private int h;
    private long i;
    private int j;
    private long k;

    public static final Descriptors.Descriptor a() {
        return mk.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mk.f.ensureFieldAccessorsInitialized(mm_0.class, mo_1.class);
    }

    mo_1() {
        this.I();
    }

    mo_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.I();
    }

    private void I() {
        if (mm_0.z()) {
            this.J();
            this.K();
        }
    }

    public mo_1 t() {
        super.clear();
        this.b = -1L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        if (this.f == null) {
            this.e = null;
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFFB;
        this.g = 0;
        this.a &= 0xFFFFFFF7;
        this.h = 0;
        this.a &= 0xFFFFFFEF;
        this.i = 0L;
        this.a &= 0xFFFFFFDF;
        this.j = 0;
        this.a &= 0xFFFFFFBF;
        this.k = 0L;
        this.a &= 0xFFFFFF7F;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mk.e;
    }

    public mm_0 u() {
        return mm_0.w();
    }

    public mm_0 v() {
        mm_0 mm_02 = this.w();
        if (!mm_02.isInitialized()) {
            throw mo_1.newUninitializedMessageException((Message)mm_02);
        }
        return mm_02;
    }

    public mm_0 w() {
        mm_0 mm_02 = new mm_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        mm_02.l = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        mm_02.m = this.d == null ? this.c : (le_0)this.d.build();
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        mm_02.n = this.f == null ? this.e : (my_0)this.f.build();
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        mm_02.o = this.g;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        mm_02.p = this.h;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        mm_02.q = this.i;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        mm_02.r = this.j;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        mm_02.s = this.k;
        mm_02.k = n2;
        this.onBuilt();
        return mm_02;
    }

    public mo_1 x() {
        return (mo_1)super.clone();
    }

    public mo_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mo_1)super.setField(fieldDescriptor, object);
    }

    public mo_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mo_1)super.clearField(fieldDescriptor);
    }

    public mo_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mo_1)super.clearOneof(oneofDescriptor);
    }

    public mo_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mo_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mo_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mo_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public mo_1 a(Message message) {
        if (message instanceof mm_0) {
            return this.a((mm_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mo_1 a(mm_0 mm_02) {
        if (mm_02 == mm_0.w()) {
            return this;
        }
        if (mm_02.b()) {
            this.a(mm_02.c());
        }
        if (mm_02.d()) {
            this.b(mm_02.e());
        }
        if (mm_02.g()) {
            this.b(mm_02.h());
        }
        if (mm_02.j()) {
            this.a(mm_02.k());
        }
        if (mm_02.l()) {
            this.b(mm_02.m());
        }
        if (mm_02.n()) {
            this.b(mm_02.o());
        }
        if (mm_02.p()) {
            this.c(mm_02.q());
        }
        if (mm_02.r()) {
            this.c(mm_02.s());
        }
        this.b(mm_0.b(mm_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.g()) {
            return false;
        }
        if (!this.j()) {
            return false;
        }
        if (!this.l()) {
            return false;
        }
        if (!this.n()) {
            return false;
        }
        if (!this.p()) {
            return false;
        }
        if (this.d() && !this.e().isInitialized()) {
            return false;
        }
        return this.h().isInitialized();
    }

    public mo_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mm_0 mm_02 = null;
        try {
            mm_02 = (mm_0)mm_0.i.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mm_02 = (mm_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mm_02 != null) {
                this.a(mm_02);
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

    public mo_1 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public mo_1 y() {
        this.a &= 0xFFFFFFFE;
        this.b = -1L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public le_0 e() {
        if (this.d == null) {
            return this.c == null ? le_0.H() : this.c;
        }
        return (le_0)this.d.getMessage();
    }

    public mo_1 a(le_0 le_02) {
        if (this.d == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.c = le_02;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)le_02);
        }
        this.a |= 2;
        return this;
    }

    public mo_1 a(lg lg2) {
        if (this.d == null) {
            this.c = lg2.G();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)lg2.G());
        }
        this.a |= 2;
        return this;
    }

    public mo_1 b(le_0 le_02) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != le_0.H() ? le_0.a(this.c).a(le_02).H() : le_02;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)le_02);
        }
        this.a |= 2;
        return this;
    }

    public mo_1 z() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public lg A() {
        this.a |= 2;
        this.onChanged();
        return (lg)this.J().getBuilder();
    }

    @Override
    public lp f() {
        if (this.d != null) {
            return (lp)this.d.getMessageOrBuilder();
        }
        return this.c == null ? le_0.H() : this.c;
    }

    private SingleFieldBuilderV3<le_0, lg, lp> J() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public my_0 h() {
        if (this.f == null) {
            return this.e == null ? my_0.n() : this.e;
        }
        return (my_0)this.f.getMessage();
    }

    public mo_1 a(my_0 my_02) {
        if (this.f == null) {
            if (my_02 == null) {
                throw new NullPointerException();
            }
            this.e = my_02;
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)my_02);
        }
        this.a |= 4;
        return this;
    }

    public mo_1 a(mA mA2) {
        if (this.f == null) {
            this.e = mA2.m();
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)mA2.m());
        }
        this.a |= 4;
        return this;
    }

    public mo_1 b(my_0 my_02) {
        if (this.f == null) {
            this.e = (this.a & 4) == 4 && this.e != null && this.e != my_0.n() ? my_0.a(this.e).a(my_02).n() : my_02;
            this.onChanged();
        } else {
            this.f.mergeFrom((AbstractMessage)my_02);
        }
        this.a |= 4;
        return this;
    }

    public mo_1 B() {
        if (this.f == null) {
            this.e = null;
            this.onChanged();
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public mA C() {
        this.a |= 4;
        this.onChanged();
        return (mA)this.K().getBuilder();
    }

    @Override
    public mB i() {
        if (this.f != null) {
            return (mB)this.f.getMessageOrBuilder();
        }
        return this.e == null ? my_0.n() : this.e;
    }

    private SingleFieldBuilderV3<my_0, mA, mB> K() {
        if (this.f == null) {
            this.f = new SingleFieldBuilderV3((AbstractMessage)this.h(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public int k() {
        return this.g;
    }

    public mo_1 a(int n) {
        this.a |= 8;
        this.g = n;
        this.onChanged();
        return this;
    }

    public mo_1 D() {
        this.a &= 0xFFFFFFF7;
        this.g = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public int m() {
        return this.h;
    }

    public mo_1 b(int n) {
        this.a |= 0x10;
        this.h = n;
        this.onChanged();
        return this;
    }

    public mo_1 E() {
        this.a &= 0xFFFFFFEF;
        this.h = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public long o() {
        return this.i;
    }

    public mo_1 b(long l) {
        this.a |= 0x20;
        this.i = l;
        this.onChanged();
        return this;
    }

    public mo_1 F() {
        this.a &= 0xFFFFFFDF;
        this.i = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean p() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public int q() {
        return this.j;
    }

    public mo_1 c(int n) {
        this.a |= 0x40;
        this.j = n;
        this.onChanged();
        return this;
    }

    public mo_1 G() {
        this.a &= 0xFFFFFFBF;
        this.j = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean r() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public long s() {
        return this.k;
    }

    public mo_1 c(long l) {
        this.a |= 0x80;
        this.k = l;
        this.onChanged();
        return this;
    }

    public mo_1 H() {
        this.a &= 0xFFFFFF7F;
        this.k = 0L;
        this.onChanged();
        return this;
    }

    public final mo_1 a(UnknownFieldSet unknownFieldSet) {
        return (mo_1)super.setUnknownFields(unknownFieldSet);
    }

    public final mo_1 b(UnknownFieldSet unknownFieldSet) {
        return (mo_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.t();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.x();
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
        return this.t();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.x();
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
        return this.x();
    }

    public /* synthetic */ Message buildPartial() {
        return this.w();
    }

    public /* synthetic */ Message build() {
        return this.v();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.t();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.x();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.w();
    }

    public /* synthetic */ MessageLite build() {
        return this.v();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.t();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.u();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.u();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.x();
    }

    public /* synthetic */ Object clone() {
        return this.x();
    }
}

