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
 * Renamed from dN
 */
public final class dn_2
extends GeneratedMessageV3.Builder<dn_2>
implements dp_1 {
    private int a;
    private boolean b;
    private int c;

    public static final Descriptors.Descriptor a() {
        return dn_1.o;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.p.ensureFieldAccessorsInitialized(dl_1.class, dn_2.class);
    }

    dn_2() {
        this.m();
    }

    dn_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (dl_1.l()) {
            // empty if block
        }
    }

    public dn_2 f() {
        super.clear();
        this.b = false;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dn_1.o;
    }

    public dl_1 g() {
        return dl_1.i();
    }

    public dl_1 h() {
        dl_1 dl_12 = this.i();
        if (!dl_12.isInitialized()) {
            throw dn_2.newUninitializedMessageException((Message)dl_12);
        }
        return dl_12;
    }

    public dl_1 i() {
        dl_1 dl_12 = new dl_1(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        dl_12.f = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        dl_12.g = this.c;
        dl_12.e = n2;
        this.onBuilt();
        return dl_12;
    }

    public dn_2 j() {
        return (dn_2)super.clone();
    }

    public dn_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dn_2)super.setField(fieldDescriptor, object);
    }

    public dn_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dn_2)super.clearField(fieldDescriptor);
    }

    public dn_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dn_2)super.clearOneof(oneofDescriptor);
    }

    public dn_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dn_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dn_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dn_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public dn_2 a(Message message) {
        if (message instanceof dl_1) {
            return this.a((dl_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dn_2 a(dl_1 dl_12) {
        if (dl_12 == dl_1.i()) {
            return this;
        }
        if (dl_12.b()) {
            this.a(dl_12.c());
        }
        if (dl_12.d()) {
            this.a(dl_12.e());
        }
        this.b(dl_1.b(dl_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.b();
    }

    public dn_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dl_1 dl_12 = null;
        try {
            dl_12 = (dl_1)dl_1.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dl_12 = (dl_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dl_12 != null) {
                this.a(dl_12);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public boolean c() {
        return this.b;
    }

    public dn_2 a(boolean bl) {
        this.a |= 1;
        this.b = bl;
        this.onChanged();
        return this;
    }

    public dn_2 k() {
        this.a &= 0xFFFFFFFE;
        this.b = false;
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

    public dn_2 a(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public dn_2 l() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    public final dn_2 a(UnknownFieldSet unknownFieldSet) {
        return (dn_2)super.setUnknownFields(unknownFieldSet);
    }

    public final dn_2 b(UnknownFieldSet unknownFieldSet) {
        return (dn_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

