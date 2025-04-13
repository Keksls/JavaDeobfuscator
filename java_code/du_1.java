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
 * Renamed from du
 */
public final class du_1
extends GeneratedMessageV3.Builder<du_1>
implements dv_1 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public static final Descriptors.Descriptor a() {
        return dn_1.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.h.ensureFieldAccessorsInitialized(ds_2.class, du_1.class);
    }

    du_1() {
        this.s();
    }

    du_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.s();
    }

    private void s() {
        if (ds_2.p()) {
            // empty if block
        }
    }

    public du_1 j() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dn_1.g;
    }

    public ds_2 k() {
        return ds_2.m();
    }

    public ds_2 l() {
        ds_2 ds_22 = this.m();
        if (!ds_22.isInitialized()) {
            throw du_1.newUninitializedMessageException((Message)ds_22);
        }
        return ds_22;
    }

    public ds_2 m() {
        ds_2 ds_22 = new ds_2(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ds_22.h = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        ds_22.i = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        ds_22.j = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        ds_22.k = this.e;
        ds_22.g = n2;
        this.onBuilt();
        return ds_22;
    }

    public du_1 n() {
        return (du_1)super.clone();
    }

    public du_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (du_1)super.setField(fieldDescriptor, object);
    }

    public du_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (du_1)super.clearField(fieldDescriptor);
    }

    public du_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (du_1)super.clearOneof(oneofDescriptor);
    }

    public du_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (du_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public du_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (du_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public du_1 a(Message message) {
        if (message instanceof ds_2) {
            return this.a((ds_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public du_1 a(ds_2 ds_22) {
        if (ds_22 == ds_2.m()) {
            return this;
        }
        if (ds_22.b()) {
            this.a(ds_22.c());
        }
        if (ds_22.d()) {
            this.b(ds_22.e());
        }
        if (ds_22.f()) {
            this.c(ds_22.g());
        }
        if (ds_22.h()) {
            this.d(ds_22.i());
        }
        this.b(ds_2.b(ds_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public du_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ds_2 ds_22 = null;
        try {
            ds_22 = (ds_2)ds_2.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ds_22 = (ds_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ds_22 != null) {
                this.a(ds_22);
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

    public du_1 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public du_1 o() {
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

    public du_1 b(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public du_1 p() {
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

    public du_1 c(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public du_1 q() {
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

    public du_1 d(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public du_1 r() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    public final du_1 a(UnknownFieldSet unknownFieldSet) {
        return (du_1)super.setUnknownFields(unknownFieldSet);
    }

    public final du_1 b(UnknownFieldSet unknownFieldSet) {
        return (du_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

