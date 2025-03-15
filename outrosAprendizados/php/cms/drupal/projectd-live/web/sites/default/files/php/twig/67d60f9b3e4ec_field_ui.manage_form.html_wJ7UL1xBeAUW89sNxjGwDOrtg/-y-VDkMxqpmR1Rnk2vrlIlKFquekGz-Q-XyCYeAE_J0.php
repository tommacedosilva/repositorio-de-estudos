<?php

use Twig\Environment;
use Twig\Error\LoaderError;
use Twig\Error\RuntimeError;
use Twig\Extension\CoreExtension;
use Twig\Extension\SandboxExtension;
use Twig\Markup;
use Twig\Sandbox\SecurityError;
use Twig\Sandbox\SecurityNotAllowedTagError;
use Twig\Sandbox\SecurityNotAllowedFilterError;
use Twig\Sandbox\SecurityNotAllowedFunctionError;
use Twig\Source;
use Twig\Template;
use Twig\TemplateWrapper;

/* @help_topics/field_ui.manage_form.html.twig */
class __TwigTemplate_7152efe98ed5a32ebef7793d00096ca2 extends Template
{
    private Source $source;
    /**
     * @var array<string, Template>
     */
    private array $macros = [];

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->parent = false;

        $this->blocks = [
        ];
        $this->sandbox = $this->extensions[SandboxExtension::class];
        $this->checkSecurity();
    }

    protected function doDisplay(array $context, array $blocks = []): iterable
    {
        $macros = $this->macros;
        // line 9
        $context["content_types_link_text"] = ('' === $tmp = \Twig\Extension\CoreExtension::captureOutput((function () use (&$context, $macros, $blocks) {
            yield t("Content types", array());
            yield from [];
        })())) ? '' : new Markup($tmp, $this->env->getCharset());
        // line 10
        $context["content_types_link"] = $this->extensions['Drupal\Core\Template\TwigExtension']->renderVar($this->extensions['Drupal\help\HelpTwigExtension']->getRouteLink(($context["content_types_link_text"] ?? null), "entity.node_type.collection"));
        // line 11
        $context["content_structure_topic"] = $this->extensions['Drupal\Core\Template\TwigExtension']->renderVar($this->extensions['Drupal\help\HelpTwigExtension']->getTopicLink("core.content_structure"));
        // line 12
        yield "<h2>";
        yield t("Goal", array());
        yield "</h2>
<p>";
        // line 13
        yield t("Configure the <em>widgets</em> used to edit the fields of an entity sub-type, their order on the form, and the widget settings. See @content_structure_topic for background information.", array("@content_structure_topic" => ($context["content_structure_topic"] ?? null), ));
        yield "</p>
<h2>";
        // line 14
        yield t("Steps", array());
        yield "</h2>
<ol>
  <li>";
        // line 16
        yield t("Navigate to the page for managing the entity type you want to add the field to. For example, to add a field to a content type, in the <em>Manage</em> administrative menu, navigate to <em>Structure</em> &gt; <em>@content_types_link</em>.", array("@content_types_link" => ($context["content_types_link"] ?? null), ));
        yield "</li>
  <li>";
        // line 17
        yield t("Find the particular sub-type that you want to configure the editing form for, and click <em>Manage form display</em> in the <em>Operations</em> list.", array());
        yield "</li>
  <li>";
        // line 18
        yield t("Use the drag arrows to order the fields in your preferred order.", array());
        yield "</li>
  <li>";
        // line 19
        yield t("Drag any fields that you do not wish to see on the editing form to the <em>Disabled</em> section.", array());
        yield "</li>
  <li>";
        // line 20
        yield t("In the <em>Widget</em> column, select the widget for editing each field.", array());
        yield "</li>
  <li>";
        // line 21
        yield t("After selecting the desired widgets, click the settings gear in each row to change the settings for the widget.", array());
        yield "</li>
  <li>";
        // line 22
        yield t("When you are done making changes, click <em>Save</em>.", array());
        yield "</li>
  <li>";
        // line 23
        yield t("Test the editing form for your entity sub-type by editing or creating an entity. If needed, return to these steps to further refine the form.", array());
        yield "</li>
</ol>";
        yield from [];
    }

    /**
     * @codeCoverageIgnore
     */
    public function getTemplateName(): string
    {
        return "@help_topics/field_ui.manage_form.html.twig";
    }

    /**
     * @codeCoverageIgnore
     */
    public function isTraitable(): bool
    {
        return false;
    }

    /**
     * @codeCoverageIgnore
     */
    public function getDebugInfo(): array
    {
        return array (  95 => 23,  91 => 22,  87 => 21,  83 => 20,  79 => 19,  75 => 18,  71 => 17,  67 => 16,  62 => 14,  58 => 13,  53 => 12,  51 => 11,  49 => 10,  44 => 9,);
    }

    public function getSourceContext(): Source
    {
        return new Source("", "@help_topics/field_ui.manage_form.html.twig", "/var/www/html/web/core/modules/field_ui/help_topics/field_ui.manage_form.html.twig");
    }
    
    public function checkSecurity()
    {
        static $tags = ["set" => 9, "trans" => 9];
        static $filters = ["escape" => 13];
        static $functions = ["render_var" => 10, "help_route_link" => 10, "help_topic_link" => 11];

        try {
            $this->sandbox->checkSecurity(
                ['set', 'trans'],
                ['escape'],
                ['render_var', 'help_route_link', 'help_topic_link'],
                $this->source
            );
        } catch (SecurityError $e) {
            $e->setSourceContext($this->source);

            if ($e instanceof SecurityNotAllowedTagError && isset($tags[$e->getTagName()])) {
                $e->setTemplateLine($tags[$e->getTagName()]);
            } elseif ($e instanceof SecurityNotAllowedFilterError && isset($filters[$e->getFilterName()])) {
                $e->setTemplateLine($filters[$e->getFilterName()]);
            } elseif ($e instanceof SecurityNotAllowedFunctionError && isset($functions[$e->getFunctionName()])) {
                $e->setTemplateLine($functions[$e->getFunctionName()]);
            }

            throw $e;
        }

    }
}
