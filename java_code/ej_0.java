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
 * Renamed from ej
 */
public final class ej_0
extends GeneratedMessageV3.Builder<ej_0>
implements ek_0 {
    private int a;
    private int b;
    private int c;

    public static final Descriptors.Descriptor a() {
        return ef.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ef.h.ensureFieldAccessorsInitialized(eh.class, ej_0.class);
    }

    ej_0() {
        this.m();
    }

    ej_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (eh.l()) {
            // empty if block
        }
    }

    public ej_0 f() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ef.g;
    }

    public eh g() {
        return eh.i();
    }

    public eh h() {
        eh eh2 = this.i();
        if (!eh2.isInitialized()) {
            throw ej_0.newUninitializedMessageException((Message)eh2);
        }
        return eh2;
    }

    public eh i() {
        eh eh2 = new eh(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        eh2.f = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        eh2.g = this.c;
        eh2.e = n2;
        this.onBuilt();
        return eh2;
    }

    public ej_0 j() {
        return (ej_0)super.clone();
    }

    public ej_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ej_0)super.setField(fieldDescriptor, object);
    }

    public ej_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ej_0)super.clearField(fieldDescriptor);
    }

    public ej_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ej_0)super.clearOneof(oneofDescriptor);
    }

    public ej_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ej_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ej_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ej_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ej_0 a(Message message) {
        if (message instanceof eh) {
            return this.a((eh)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ej_0 a(eh eh2) {
        if (eh2 == eh.i()) {
            return this;
        }
        if (eh2.b()) {
            this.a(eh2.c());
        }
        if (eh2.d()) {
            this.b(eh2.e());
        }
        this.b(eh.b(eh2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        return this.d();
    }

    public ej_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eh eh2 = null;
        try {
            eh2 = (eh)eh.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eh2 = (eh)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eh2 != null) {
                this.a(eh2);
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

    public ej_0 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public ej_0 k() {
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

    public ej_0 b(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public ej_0 l() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    public final ej_0 a(UnknownFieldSet unknownFieldSet) {
        return (ej_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ej_0 b(UnknownFieldSet unknownFieldSet) {
        return (ej_0)super.mergeUnknownFields(unknownFieldSet);
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

