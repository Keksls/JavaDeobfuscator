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

public final class jC
extends GeneratedMessageV3.Builder<jC>
implements jD {
    private int a;
    private long b;
    private long c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;

    public static final Descriptors.Descriptor a() {
        return iw_0.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.l.ensureFieldAccessorsInitialized(ja_0.class, jC.class);
    }

    jC() {
        this.B();
    }

    jC(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.B();
    }

    private void B() {
        if (ja_0.v()) {
            // empty if block
        }
    }

    public jC p() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = false;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = 0;
        this.a &= 0xFFFFFFDF;
        this.h = 0L;
        this.a &= 0xFFFFFFBF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iw_0.k;
    }

    public ja_0 q() {
        return ja_0.s();
    }

    public ja_0 r() {
        ja_0 ja_02 = this.s();
        if (!ja_02.isInitialized()) {
            throw jC.newUninitializedMessageException((Message)ja_02);
        }
        return ja_02;
    }

    public ja_0 s() {
        ja_0 ja_02 = new ja_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ja_02.k = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        ja_02.l = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        ja_02.m = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        ja_02.n = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        ja_02.o = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        ja_02.p = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        ja_02.q = this.h;
        ja_02.j = n2;
        this.onBuilt();
        return ja_02;
    }

    public jC t() {
        return (jC)super.clone();
    }

    public jC a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jC)super.setField(fieldDescriptor, object);
    }

    public jC a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jC)super.clearField(fieldDescriptor);
    }

    public jC a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jC)super.clearOneof(oneofDescriptor);
    }

    public jC a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jC)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jC b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jC)super.addRepeatedField(fieldDescriptor, object);
    }

    public jC a(Message message) {
        if (message instanceof ja_0) {
            return this.a((ja_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jC a(ja_0 ja_02) {
        if (ja_02 == ja_0.s()) {
            return this;
        }
        if (ja_02.b()) {
            this.a(ja_02.c());
        }
        if (ja_02.d()) {
            this.b(ja_02.e());
        }
        if (ja_02.f()) {
            this.a(ja_02.g());
        }
        if (ja_02.h()) {
            this.a(ja_02.i());
        }
        if (ja_02.j()) {
            this.b(ja_02.k());
        }
        if (ja_02.l()) {
            this.c(ja_02.m());
        }
        if (ja_02.n()) {
            this.c(ja_02.o());
        }
        this.b(ja_0.b(ja_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public jC a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ja_0 ja_02 = null;
        try {
            ja_02 = (ja_0)ja_0.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ja_02 = (ja_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ja_02 != null) {
                this.a(ja_02);
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

    public jC a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public jC u() {
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

    public jC b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public jC v() {
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
    public boolean g() {
        return this.d;
    }

    public jC a(boolean bl) {
        this.a |= 4;
        this.d = bl;
        this.onChanged();
        return this;
    }

    public jC w() {
        this.a &= 0xFFFFFFFB;
        this.d = false;
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

    public jC a(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public jC x() {
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

    public jC b(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public jC y() {
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
    public int m() {
        return this.g;
    }

    public jC c(int n) {
        this.a |= 0x20;
        this.g = n;
        this.onChanged();
        return this;
    }

    public jC z() {
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
    public long o() {
        return this.h;
    }

    public jC c(long l) {
        this.a |= 0x40;
        this.h = l;
        this.onChanged();
        return this;
    }

    public jC A() {
        this.a &= 0xFFFFFFBF;
        this.h = 0L;
        this.onChanged();
        return this;
    }

    public final jC a(UnknownFieldSet unknownFieldSet) {
        return (jC)super.setUnknownFields(unknownFieldSet);
    }

    public final jC b(UnknownFieldSet unknownFieldSet) {
        return (jC)super.mergeUnknownFields(unknownFieldSet);
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
        return this.p();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.t();
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
        return this.p();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.t();
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
        return this.t();
    }

    public /* synthetic */ Message buildPartial() {
        return this.s();
    }

    public /* synthetic */ Message build() {
        return this.r();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.t();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.s();
    }

    public /* synthetic */ MessageLite build() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.p();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.t();
    }

    public /* synthetic */ Object clone() {
        return this.t();
    }
}

