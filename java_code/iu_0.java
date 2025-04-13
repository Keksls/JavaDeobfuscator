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
 * Renamed from iU
 */
public final class iu_0
extends GeneratedMessageV3.Builder<iu_0>
implements iv_1 {
    private int a;
    private long b;
    private int c;
    private int d;
    private long e;
    private int f;

    public static final Descriptors.Descriptor a() {
        return io_0.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.j.ensureFieldAccessorsInitialized(is_0.class, iu_0.class);
    }

    iu_0() {
        this.v();
    }

    iu_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.v();
    }

    private void v() {
        if (is_0.r()) {
            // empty if block
        }
    }

    public iu_0 l() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0L;
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return io_0.i;
    }

    public is_0 m() {
        return is_0.o();
    }

    public is_0 n() {
        is_0 is_02 = this.o();
        if (!is_02.isInitialized()) {
            throw iu_0.newUninitializedMessageException((Message)is_02);
        }
        return is_02;
    }

    public is_0 o() {
        is_0 is_02 = new is_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        is_02.i = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        is_02.j = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        is_02.k = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        is_02.l = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        is_02.m = this.f;
        is_02.h = n2;
        this.onBuilt();
        return is_02;
    }

    public iu_0 p() {
        return (iu_0)super.clone();
    }

    public iu_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (iu_0)super.setField(fieldDescriptor, object);
    }

    public iu_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (iu_0)super.clearField(fieldDescriptor);
    }

    public iu_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (iu_0)super.clearOneof(oneofDescriptor);
    }

    public iu_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (iu_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public iu_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (iu_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public iu_0 a(Message message) {
        if (message instanceof is_0) {
            return this.a((is_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public iu_0 a(is_0 is_02) {
        if (is_02 == is_0.o()) {
            return this;
        }
        if (is_02.b()) {
            this.a(is_02.c());
        }
        if (is_02.d()) {
            this.a(is_02.e());
        }
        if (is_02.f()) {
            this.b(is_02.g());
        }
        if (is_02.h()) {
            this.b(is_02.i());
        }
        if (is_02.j()) {
            this.c(is_02.k());
        }
        this.b(is_0.b(is_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public iu_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        is_0 is_02 = null;
        try {
            is_02 = (is_0)is_0.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            is_02 = (is_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (is_02 != null) {
                this.a(is_02);
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

    public iu_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public iu_0 q() {
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

    public iu_0 a(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public iu_0 r() {
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

    public iu_0 b(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public iu_0 s() {
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
    public long i() {
        return this.e;
    }

    public iu_0 b(long l) {
        this.a |= 8;
        this.e = l;
        this.onChanged();
        return this;
    }

    public iu_0 t() {
        this.a &= 0xFFFFFFF7;
        this.e = 0L;
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

    public iu_0 c(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public iu_0 u() {
        this.a &= 0xFFFFFFEF;
        this.f = 0;
        this.onChanged();
        return this;
    }

    public final iu_0 a(UnknownFieldSet unknownFieldSet) {
        return (iu_0)super.setUnknownFields(unknownFieldSet);
    }

    public final iu_0 b(UnknownFieldSet unknownFieldSet) {
        return (iu_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.l();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.p();
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
        return this.l();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.p();
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
        return this.p();
    }

    public /* synthetic */ Message buildPartial() {
        return this.o();
    }

    public /* synthetic */ Message build() {
        return this.n();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.o();
    }

    public /* synthetic */ MessageLite build() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Object clone() {
        return this.p();
    }
}

