/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
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
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from zI
 */
public final class zi_2
extends GeneratedMessageV3.Builder<zi_2>
implements zj_2 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private int i;

    public static final Descriptors.Descriptor a() {
        return zw_1.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zw_1.d.ensureFieldAccessorsInitialized(zg_2.class, zi_2.class);
    }

    zi_2() {
        this.E();
    }

    zi_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.E();
    }

    private void E() {
        if (zg_2.x()) {
            // empty if block
        }
    }

    public zi_2 r() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = false;
        this.a &= 0xFFFFFFDF;
        this.h = 0L;
        this.a &= 0xFFFFFFBF;
        this.i = 0;
        this.a &= 0xFFFFFF7F;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zw_1.c;
    }

    public zg_2 s() {
        return zg_2.u();
    }

    public zg_2 t() {
        zg_2 zg_22 = this.u();
        if (!zg_22.isInitialized()) {
            throw zi_2.newUninitializedMessageException((Message)zg_22);
        }
        return zg_22;
    }

    public zg_2 u() {
        zg_2 zg_22 = new zg_2(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        zg_22.l = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        zg_22.m = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        zg_22.n = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        zg_22.o = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        zg_22.p = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        zg_22.q = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        zg_22.r = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        zg_22.s = this.i;
        zg_22.k = n2;
        this.onBuilt();
        return zg_22;
    }

    public zi_2 v() {
        return (zi_2)super.clone();
    }

    public zi_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zi_2)super.setField(fieldDescriptor, object);
    }

    public zi_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zi_2)super.clearField(fieldDescriptor);
    }

    public zi_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zi_2)super.clearOneof(oneofDescriptor);
    }

    public zi_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zi_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zi_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zi_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public zi_2 a(Message message) {
        if (message instanceof zg_2) {
            return this.a((zg_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zi_2 a(zg_2 zg_22) {
        if (zg_22 == zg_2.u()) {
            return this;
        }
        if (zg_22.b()) {
            this.a(zg_22.c());
        }
        if (zg_22.d()) {
            this.b(zg_22.e());
        }
        if (zg_22.f()) {
            this.c(zg_22.g());
        }
        if (zg_22.h()) {
            this.d(zg_22.i());
        }
        if (zg_22.j()) {
            this.e(zg_22.k());
        }
        if (zg_22.l()) {
            this.a(zg_22.m());
        }
        if (zg_22.n()) {
            this.a(zg_22.o());
        }
        if (zg_22.p()) {
            this.f(zg_22.q());
        }
        this.b(zg_2.b(zg_22));
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
        if (!this.j()) {
            return false;
        }
        return this.l();
    }

    public zi_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zg_2 zg_22 = null;
        try {
            zg_22 = (zg_2)zg_2.i.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zg_22 = (zg_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zg_22 != null) {
                this.a(zg_22);
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

    public zi_2 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public zi_2 w() {
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
    public int e() {
        return this.c;
    }

    public zi_2 b(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public zi_2 x() {
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

    public zi_2 c(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public zi_2 y() {
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

    public zi_2 d(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public zi_2 z() {
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
    public int k() {
        return this.f;
    }

    public zi_2 e(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public zi_2 A() {
        this.a &= 0xFFFFFFEF;
        this.f = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public boolean m() {
        return this.g;
    }

    public zi_2 a(boolean bl) {
        this.a |= 0x20;
        this.g = bl;
        this.onChanged();
        return this;
    }

    public zi_2 B() {
        this.a &= 0xFFFFFFDF;
        this.g = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public long o() {
        return this.h;
    }

    public zi_2 a(long l) {
        this.a |= 0x40;
        this.h = l;
        this.onChanged();
        return this;
    }

    public zi_2 C() {
        this.a &= 0xFFFFFFBF;
        this.h = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean p() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public int q() {
        return this.i;
    }

    public zi_2 f(int n) {
        this.a |= 0x80;
        this.i = n;
        this.onChanged();
        return this;
    }

    public zi_2 D() {
        this.a &= 0xFFFFFF7F;
        this.i = 0;
        this.onChanged();
        return this;
    }

    public final zi_2 a(UnknownFieldSet unknownFieldSet) {
        return (zi_2)super.setUnknownFields(unknownFieldSet);
    }

    public final zi_2 b(UnknownFieldSet unknownFieldSet) {
        return (zi_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.r();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.v();
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
        return this.r();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.v();
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
        return this.v();
    }

    public /* synthetic */ Message buildPartial() {
        return this.u();
    }

    public /* synthetic */ Message build() {
        return this.t();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.v();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.u();
    }

    public /* synthetic */ MessageLite build() {
        return this.t();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.r();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.v();
    }

    public /* synthetic */ Object clone() {
        return this.v();
    }
}

