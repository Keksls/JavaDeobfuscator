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

/*
 * Renamed from en
 */
public final class en_0
extends GeneratedMessageV3.Builder<en_0>
implements eo_0 {
    private int a;
    private int b;
    private List<eh> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<eh, ej_0, ek_0> d;

    public static final Descriptors.Descriptor a() {
        return ef.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ef.f.ensureFieldAccessorsInitialized(el_0.class, en_0.class);
    }

    en_0() {
        this.p();
    }

    en_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.p();
    }

    private void p() {
        if (el_0.m()) {
            this.r();
        }
    }

    public en_0 g() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ef.e;
    }

    public el_0 h() {
        return el_0.j();
    }

    public el_0 i() {
        el_0 el_02 = this.j();
        if (!el_02.isInitialized()) {
            throw en_0.newUninitializedMessageException((Message)el_02);
        }
        return el_02;
    }

    public el_0 j() {
        el_0 el_02 = new el_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        el_02.f = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            el_02.g = this.c;
        } else {
            el_02.g = this.d.build();
        }
        el_02.e = n2;
        this.onBuilt();
        return el_02;
    }

    public en_0 k() {
        return (en_0)super.clone();
    }

    public en_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (en_0)super.setField(fieldDescriptor, object);
    }

    public en_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (en_0)super.clearField(fieldDescriptor);
    }

    public en_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (en_0)super.clearOneof(oneofDescriptor);
    }

    public en_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (en_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public en_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (en_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public en_0 a(Message message) {
        if (message instanceof el_0) {
            return this.a((el_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public en_0 a(el_0 el_02) {
        if (el_02 == el_0.j()) {
            return this;
        }
        if (el_02.b()) {
            this.c(el_02.c());
        }
        if (this.d == null) {
            if (!el_02.g.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = el_02.g;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.q();
                    this.c.addAll(el_02.g);
                }
                this.onChanged();
            }
        } else if (!el_02.g.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = el_02.g;
                this.a &= 0xFFFFFFFD;
                this.d = el_0.n() ? this.r() : null;
            } else {
                this.d.addAllMessages(el_02.g);
            }
        }
        this.b(el_0.b(el_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public en_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        el_0 el_02 = null;
        try {
            el_02 = (el_0)el_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            el_02 = (el_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (el_02 != null) {
                this.a(el_02);
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

    public en_0 c(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public en_0 l() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    private void q() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<eh>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<eh> d() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int f() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public eh a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (eh)this.d.getMessage(n);
    }

    public en_0 a(int n, eh eh2) {
        if (this.d == null) {
            if (eh2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.set(n, eh2);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)eh2);
        }
        return this;
    }

    public en_0 a(int n, ej_0 ej_02) {
        if (this.d == null) {
            this.q();
            this.c.set(n, ej_02.h());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)ej_02.h());
        }
        return this;
    }

    public en_0 a(eh eh2) {
        if (this.d == null) {
            if (eh2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.add(eh2);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)eh2);
        }
        return this;
    }

    public en_0 b(int n, eh eh2) {
        if (this.d == null) {
            if (eh2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.add(n, eh2);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)eh2);
        }
        return this;
    }

    public en_0 a(ej_0 ej_02) {
        if (this.d == null) {
            this.q();
            this.c.add(ej_02.h());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)ej_02.h());
        }
        return this;
    }

    public en_0 b(int n, ej_0 ej_02) {
        if (this.d == null) {
            this.q();
            this.c.add(n, ej_02.h());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)ej_02.h());
        }
        return this;
    }

    public en_0 a(Iterable<? extends eh> iterable) {
        if (this.d == null) {
            this.q();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public en_0 m() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public en_0 d(int n) {
        if (this.d == null) {
            this.q();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public ej_0 e(int n) {
        return (ej_0)this.r().getBuilder(n);
    }

    @Override
    public ek_0 b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (ek_0)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ek_0> e() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public ej_0 n() {
        return (ej_0)this.r().addBuilder((AbstractMessage)eh.i());
    }

    public ej_0 f(int n) {
        return (ej_0)this.r().addBuilder(n, (AbstractMessage)eh.i());
    }

    public List<ej_0> o() {
        return this.r().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eh, ej_0, ek_0> r() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final en_0 a(UnknownFieldSet unknownFieldSet) {
        return (en_0)super.setUnknownFields(unknownFieldSet);
    }

    public final en_0 b(UnknownFieldSet unknownFieldSet) {
        return (en_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
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
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
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
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

