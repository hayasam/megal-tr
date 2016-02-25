/**
 * generated by Xtext
 */
package org.softlang.megal.language.formatting;

import com.google.inject.Inject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.xbase.lib.Extension;
import org.softlang.megal.language.services.MegalGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class MegalFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private MegalGrammarAccess _megalGrammarAccess;
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    c.setAutoLinewrap(120);
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    MegalGrammarAccess.MegalFileElements _megalFileAccess = this._megalGrammarAccess.getMegalFileAccess();
    Keyword _importKeyword_3_0_0 = _megalFileAccess.getImportKeyword_3_0_0();
    _setLinewrap.before(_importKeyword_3_0_0);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    MegalGrammarAccess.MegalFileElements _megalFileAccess_1 = this._megalGrammarAccess.getMegalFileAccess();
    Assignment _nameAssignment_2 = _megalFileAccess_1.getNameAssignment_2();
    _setLinewrap_1.after(_nameAssignment_2);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 2);
    MegalGrammarAccess.MegalFileElements _megalFileAccess_2 = this._megalGrammarAccess.getMegalFileAccess();
    Assignment _importsAssignment_3_0_1 = _megalFileAccess_2.getImportsAssignment_3_0_1();
    _setLinewrap_2.after(_importsAssignment_3_0_1);
    FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap(0, 1, 2);
    ParserRule _megalAnnotationRule = this._megalGrammarAccess.getMegalAnnotationRule();
    _setLinewrap_3.around(_megalAnnotationRule);
    FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
    MegalGrammarAccess.MegalAnnotationElements _megalAnnotationAccess = this._megalGrammarAccess.getMegalAnnotationAccess();
    Keyword _commercialAtKeyword_0 = _megalAnnotationAccess.getCommercialAtKeyword_0();
    _setNoSpace.after(_commercialAtKeyword_0);
    FormattingConfig.SpaceLocator _setSpace = c.setSpace(" ");
    MegalGrammarAccess.MegalAnnotationElements _megalAnnotationAccess_1 = this._megalGrammarAccess.getMegalAnnotationAccess();
    Assignment _keyAssignment_1 = _megalAnnotationAccess_1.getKeyAssignment_1();
    MegalGrammarAccess.MegalAnnotationElements _megalAnnotationAccess_2 = this._megalGrammarAccess.getMegalAnnotationAccess();
    Assignment _valueAssignment_2 = _megalAnnotationAccess_2.getValueAssignment_2();
    _setSpace.between(_keyAssignment_1, _valueAssignment_2);
    FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap(0, 1, 2);
    ParserRule _megalLinkRule = this._megalGrammarAccess.getMegalLinkRule();
    _setLinewrap_4.around(_megalLinkRule);
    FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
    MegalGrammarAccess.MegalLinkElements _megalLinkAccess = this._megalGrammarAccess.getMegalLinkAccess();
    Keyword _leftParenthesisKeyword_2_0 = _megalLinkAccess.getLeftParenthesisKeyword_2_0();
    _setNoSpace_1.around(_leftParenthesisKeyword_2_0);
    FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
    MegalGrammarAccess.MegalLinkElements _megalLinkAccess_1 = this._megalGrammarAccess.getMegalLinkAccess();
    Keyword _rightParenthesisKeyword_2_2 = _megalLinkAccess_1.getRightParenthesisKeyword_2_2();
    _setNoSpace_2.before(_rightParenthesisKeyword_2_2);
    FormattingConfig.SpaceLocator _setSpace_1 = c.setSpace(" ");
    MegalGrammarAccess.MegalLinkElements _megalLinkAccess_2 = this._megalGrammarAccess.getMegalLinkAccess();
    Keyword _rightParenthesisKeyword_2_2_1 = _megalLinkAccess_2.getRightParenthesisKeyword_2_2();
    _setSpace_1.after(_rightParenthesisKeyword_2_2_1);
    FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap(0, 0, 1);
    MegalGrammarAccess.MegalLinkElements _megalLinkAccess_3 = this._megalGrammarAccess.getMegalLinkAccess();
    Keyword _rightParenthesisKeyword_2_2_2 = _megalLinkAccess_3.getRightParenthesisKeyword_2_2();
    _setLinewrap_5.after(_rightParenthesisKeyword_2_2_2);
    FormattingConfig.SpaceLocator _setSpace_2 = c.setSpace(" ");
    MegalGrammarAccess.MegalLinkElements _megalLinkAccess_4 = this._megalGrammarAccess.getMegalLinkAccess();
    Keyword _verticalLineHyphenMinusGreaterThanSignKeyword_2_3 = _megalLinkAccess_4.getVerticalLineHyphenMinusGreaterThanSignKeyword_2_3();
    _setSpace_2.before(_verticalLineHyphenMinusGreaterThanSignKeyword_2_3);
    FormattingConfig.SpaceLocator _setSpace_3 = c.setSpace(" ");
    MegalGrammarAccess.MegalLinkElements _megalLinkAccess_5 = this._megalGrammarAccess.getMegalLinkAccess();
    Keyword _verticalLineHyphenMinusGreaterThanSignKeyword_2_3_1 = _megalLinkAccess_5.getVerticalLineHyphenMinusGreaterThanSignKeyword_2_3();
    _setSpace_3.after(_verticalLineHyphenMinusGreaterThanSignKeyword_2_3_1);
    FormattingConfig.SpaceLocator _setSpace_4 = c.setSpace(" ");
    MegalGrammarAccess.MegalLinkElements _megalLinkAccess_6 = this._megalGrammarAccess.getMegalLinkAccess();
    Keyword _equalsSignKeyword_3 = _megalLinkAccess_6.getEqualsSignKeyword_3();
    _setSpace_4.before(_equalsSignKeyword_3);
    FormattingConfig.SpaceLocator _setSpace_5 = c.setSpace(" ");
    MegalGrammarAccess.MegalLinkElements _megalLinkAccess_7 = this._megalGrammarAccess.getMegalLinkAccess();
    Keyword _equalsSignKeyword_3_1 = _megalLinkAccess_7.getEqualsSignKeyword_3();
    _setSpace_5.after(_equalsSignKeyword_3_1);
    FormattingConfig.LinewrapLocator _setLinewrap_6 = c.setLinewrap(0, 1, 2);
    ParserRule _megalEntityTypeRule = this._megalGrammarAccess.getMegalEntityTypeRule();
    _setLinewrap_6.around(_megalEntityTypeRule);
    FormattingConfig.SpaceLocator _setSpace_6 = c.setSpace(" ");
    MegalGrammarAccess.MegalEntityTypeElements _megalEntityTypeAccess = this._megalGrammarAccess.getMegalEntityTypeAccess();
    Keyword _lessThanSignKeyword_2_0_0 = _megalEntityTypeAccess.getLessThanSignKeyword_2_0_0();
    _setSpace_6.before(_lessThanSignKeyword_2_0_0);
    FormattingConfig.SpaceLocator _setSpace_7 = c.setSpace(" ");
    MegalGrammarAccess.MegalEntityTypeElements _megalEntityTypeAccess_1 = this._megalGrammarAccess.getMegalEntityTypeAccess();
    Keyword _lessThanSignKeyword_2_0_0_1 = _megalEntityTypeAccess_1.getLessThanSignKeyword_2_0_0();
    _setSpace_7.after(_lessThanSignKeyword_2_0_0_1);
    FormattingConfig.LinewrapLocator _setLinewrap_7 = c.setLinewrap(0, 1, 2);
    ParserRule _megalRelationshipTypeRule = this._megalGrammarAccess.getMegalRelationshipTypeRule();
    _setLinewrap_7.around(_megalRelationshipTypeRule);
    FormattingConfig.SpaceLocator _setSpace_8 = c.setSpace(" ");
    MegalGrammarAccess.MegalRelationshipTypeElements _megalRelationshipTypeAccess = this._megalGrammarAccess.getMegalRelationshipTypeAccess();
    Keyword _lessThanSignKeyword_2 = _megalRelationshipTypeAccess.getLessThanSignKeyword_2();
    _setSpace_8.before(_lessThanSignKeyword_2);
    FormattingConfig.SpaceLocator _setSpace_9 = c.setSpace(" ");
    MegalGrammarAccess.MegalRelationshipTypeElements _megalRelationshipTypeAccess_1 = this._megalGrammarAccess.getMegalRelationshipTypeAccess();
    Keyword _lessThanSignKeyword_2_1 = _megalRelationshipTypeAccess_1.getLessThanSignKeyword_2();
    _setSpace_9.after(_lessThanSignKeyword_2_1);
    FormattingConfig.SpaceLocator _setSpace_10 = c.setSpace(" ");
    MegalGrammarAccess.MegalRelationshipTypeElements _megalRelationshipTypeAccess_2 = this._megalGrammarAccess.getMegalRelationshipTypeAccess();
    Keyword _asteriskKeyword_6 = _megalRelationshipTypeAccess_2.getAsteriskKeyword_6();
    _setSpace_10.before(_asteriskKeyword_6);
    FormattingConfig.SpaceLocator _setSpace_11 = c.setSpace(" ");
    MegalGrammarAccess.MegalRelationshipTypeElements _megalRelationshipTypeAccess_3 = this._megalGrammarAccess.getMegalRelationshipTypeAccess();
    Keyword _asteriskKeyword_6_1 = _megalRelationshipTypeAccess_3.getAsteriskKeyword_6();
    _setSpace_11.after(_asteriskKeyword_6_1);
    FormattingConfig.LinewrapLocator _setLinewrap_8 = c.setLinewrap(0, 1, 2);
    ParserRule _megalEntityRule = this._megalGrammarAccess.getMegalEntityRule();
    _setLinewrap_8.around(_megalEntityRule);
    FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
    MegalGrammarAccess.MegalEntityElements _megalEntityAccess = this._megalGrammarAccess.getMegalEntityAccess();
    Keyword _colonKeyword_2 = _megalEntityAccess.getColonKeyword_2();
    _setNoSpace_3.before(_colonKeyword_2);
    FormattingConfig.SpaceLocator _setSpace_12 = c.setSpace(" ");
    MegalGrammarAccess.MegalEntityElements _megalEntityAccess_1 = this._megalGrammarAccess.getMegalEntityAccess();
    Keyword _colonKeyword_2_1 = _megalEntityAccess_1.getColonKeyword_2();
    _setSpace_12.after(_colonKeyword_2_1);
    FormattingConfig.LinewrapLocator _setLinewrap_9 = c.setLinewrap(0, 1, 2);
    ParserRule _megalRelationshipRule = this._megalGrammarAccess.getMegalRelationshipRule();
    _setLinewrap_9.around(_megalRelationshipRule);
    FormattingConfig.SpaceLocator _setSpace_13 = c.setSpace(" ");
    MegalGrammarAccess.MegalRelationshipElements _megalRelationshipAccess = this._megalGrammarAccess.getMegalRelationshipAccess();
    Assignment _typeAssignment_2 = _megalRelationshipAccess.getTypeAssignment_2();
    _setSpace_13.before(_typeAssignment_2);
    FormattingConfig.SpaceLocator _setSpace_14 = c.setSpace(" ");
    MegalGrammarAccess.MegalRelationshipElements _megalRelationshipAccess_1 = this._megalGrammarAccess.getMegalRelationshipAccess();
    Assignment _typeAssignment_2_1 = _megalRelationshipAccess_1.getTypeAssignment_2();
    _setSpace_14.after(_typeAssignment_2_1);
    FormattingConfig.LinewrapLocator _setLinewrap_10 = c.setLinewrap(0, 1, 2);
    ParserRule _megalPairRule = this._megalGrammarAccess.getMegalPairRule();
    _setLinewrap_10.around(_megalPairRule);
    FormattingConfig.NoSpaceLocator _setNoSpace_4 = c.setNoSpace();
    MegalGrammarAccess.MegalPairElements _megalPairAccess = this._megalGrammarAccess.getMegalPairAccess();
    Keyword _leftParenthesisKeyword_2 = _megalPairAccess.getLeftParenthesisKeyword_2();
    _setNoSpace_4.around(_leftParenthesisKeyword_2);
    FormattingConfig.NoSpaceLocator _setNoSpace_5 = c.setNoSpace();
    MegalGrammarAccess.MegalPairElements _megalPairAccess_1 = this._megalGrammarAccess.getMegalPairAccess();
    Keyword _rightParenthesisKeyword_4 = _megalPairAccess_1.getRightParenthesisKeyword_4();
    _setNoSpace_5.before(_rightParenthesisKeyword_4);
    FormattingConfig.SpaceLocator _setSpace_15 = c.setSpace(" ");
    MegalGrammarAccess.MegalPairElements _megalPairAccess_2 = this._megalGrammarAccess.getMegalPairAccess();
    Keyword _rightParenthesisKeyword_4_1 = _megalPairAccess_2.getRightParenthesisKeyword_4();
    _setSpace_15.after(_rightParenthesisKeyword_4_1);
    FormattingConfig.LinewrapLocator _setLinewrap_11 = c.setLinewrap(0, 0, 1);
    MegalGrammarAccess.MegalPairElements _megalPairAccess_3 = this._megalGrammarAccess.getMegalPairAccess();
    Keyword _rightParenthesisKeyword_4_2 = _megalPairAccess_3.getRightParenthesisKeyword_4();
    _setLinewrap_11.after(_rightParenthesisKeyword_4_2);
    FormattingConfig.SpaceLocator _setSpace_16 = c.setSpace(" ");
    MegalGrammarAccess.MegalPairElements _megalPairAccess_4 = this._megalGrammarAccess.getMegalPairAccess();
    Keyword _verticalLineHyphenMinusGreaterThanSignKeyword_5 = _megalPairAccess_4.getVerticalLineHyphenMinusGreaterThanSignKeyword_5();
    _setSpace_16.before(_verticalLineHyphenMinusGreaterThanSignKeyword_5);
    FormattingConfig.SpaceLocator _setSpace_17 = c.setSpace(" ");
    MegalGrammarAccess.MegalPairElements _megalPairAccess_5 = this._megalGrammarAccess.getMegalPairAccess();
    Keyword _verticalLineHyphenMinusGreaterThanSignKeyword_5_1 = _megalPairAccess_5.getVerticalLineHyphenMinusGreaterThanSignKeyword_5();
    _setSpace_17.after(_verticalLineHyphenMinusGreaterThanSignKeyword_5_1);
    FormattingConfig.LinewrapLocator _setLinewrap_12 = c.setLinewrap(0, 1, 2);
    TerminalRule _cOMMENTRule = this._megalGrammarAccess.getCOMMENTRule();
    _setLinewrap_12.before(_cOMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_13 = c.setLinewrap(0, 1, 1);
    TerminalRule _cOMMENTRule_1 = this._megalGrammarAccess.getCOMMENTRule();
    _setLinewrap_13.after(_cOMMENTRule_1);
  }
}
