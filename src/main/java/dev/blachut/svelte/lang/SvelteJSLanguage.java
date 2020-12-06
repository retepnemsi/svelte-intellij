package dev.blachut.svelte.lang;

import com.intellij.lang.DependentLanguage;
import com.intellij.lang.javascript.DialectOptionHolder;
import com.intellij.lang.javascript.JSLanguageDialect;
import com.intellij.lang.javascript.JavaScriptSupportLoader;

/**
 * Always nested inside {@link SvelteHTMLLanguage}
 */
public class SvelteJSLanguage extends JSLanguageDialect implements DependentLanguage {
    public static final SvelteJSLanguage INSTANCE = new SvelteJSLanguage();

    private SvelteJSLanguage() {
        super("SvelteJS", DialectOptionHolder.ECMA_6, JavaScriptSupportLoader.ECMA_SCRIPT_6);
    }
}
