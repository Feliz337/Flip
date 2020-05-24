package cc.foxa.flip.shared.domain.rule

import cc.foxa.flip.shared.data.model.Rule
import cc.foxa.flip.shared.data.source.RuleFilterDao
import cc.foxa.flip.shared.domain.UseCase
import javax.inject.Inject

class DeleteRule @Inject constructor(
    private val ruleFilterDao: RuleFilterDao
) : UseCase<Rule, Unit>() {
    override fun execute(parameters: Rule) {
        ruleFilterDao.deleteRule(parameters)
    }

}