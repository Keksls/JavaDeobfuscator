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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ju
extends GeneratedMessageV3.Builder<ju>
implements jz {
    private int a;
    private List<jv> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<jv, jx, jy> c;

    public static final Descriptors.Descriptor a() {
        return iw_0.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.n.ensureFieldAccessorsInitialized(js.class, ju.class);
    }

    ju() {
        this.m();
    }

    ju(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (js.k()) {
            this.o();
        }
    }

    public ju e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iw_0.m;
    }

    public js f() {
        return js.h();
    }

    public js g() {
        js js2 = this.h();
        if (!js2.isInitialized()) {
            throw ju.newUninitializedMessageException((Message)js2);
        }
        return js2;
    }

    public js h() {
        js js2 = new js(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            js2.d = this.b;
        } else {
            js2.d = this.c.build();
        }
        this.onBuilt();
        return js2;
    }

    public ju i() {
        return (ju)super.clone();
    }

    public ju a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ju)super.setField(fieldDescriptor, object);
    }

    public ju a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ju)super.clearField(fieldDescriptor);
    }

    public ju a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ju)super.clearOneof(oneofDescriptor);
    }

    public ju a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ju)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ju b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ju)super.addRepeatedField(fieldDescriptor, object);
    }

    public ju a(Message message) {
        if (message instanceof js) {
            return this.a((js)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ju a(js js2) {
        if (js2 == js.h()) {
            return this;
        }
        if (this.c == null) {
            if (!js2.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = js2.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(js2.d);
                }
                this.onChanged();
            }
        } else if (!js2.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = js2.d;
                this.a &= 0xFFFFFFFE;
                this.c = js.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(js2.d);
            }
        }
        this.b(js.b(js2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ju a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        js js2 = null;
        try {
            js2 = (js)js.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            js2 = (js)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (js2 != null) {
                this.a(js2);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<jv>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<jv> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public jv a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (jv)this.c.getMessage(n);
    }

    public ju a(int n, jv jv2) {
        if (this.c == null) {
            if (jv2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, jv2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)jv2);
        }
        return this;
    }

    public ju a(int n, jx jx2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, jx2.i());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)jx2.i());
        }
        return this;
    }

    public ju a(jv jv2) {
        if (this.c == null) {
            if (jv2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(jv2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)jv2);
        }
        return this;
    }

    public ju b(int n, jv jv2) {
        if (this.c == null) {
            if (jv2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, jv2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)jv2);
        }
        return this;
    }

    public ju a(jx jx2) {
        if (this.c == null) {
            this.n();
            this.b.add(jx2.i());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)jx2.i());
        }
        return this;
    }

    public ju b(int n, jx jx2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, jx2.i());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)jx2.i());
        }
        return this;
    }

    public ju a(Iterable<? extends jv> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public ju j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public ju c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public jx d(int n) {
        return (jx)this.o().getBuilder(n);
    }

    @Override
    public jy b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (jy)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends jy> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public jx k() {
        return (jx)this.o().addBuilder((AbstractMessage)jv.j());
    }

    public jx e(int n) {
        return (jx)this.o().addBuilder(n, (AbstractMessage)jv.j());
    }

    public List<jx> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<jv, jx, jy> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final ju a(UnknownFieldSet unknownFieldSet) {
        return (ju)super.setUnknownFields(unknownFieldSet);
    }

    public final ju b(UnknownFieldSet unknownFieldSet) {
        return (ju)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

